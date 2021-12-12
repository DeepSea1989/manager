package com.lhdb.game.config;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lhdb.game.controller.PlayerController;
import com.lhdb.game.dao.UserOperationLogWriter;
import com.lhdb.game.dao.UsersMapper;
import com.lhdb.game.entity.ModulePermission;
import com.lhdb.game.entity.UserOperatationLog;
import com.lhdb.game.entity.Users;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.common.json.JSON;
import com.lhdb.util.business.Code;

@Component
public class PageInterceptor implements HandlerInterceptor {
	
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private UserOperationLogWriter logWriter;

	Logger logger = Logger.getLogger(PlayerController.class);
	

	
	/** 
     * 在请求处理之前执行，该方法主要是用于准备资源数据的，然后可以把它们当做请求属性放到WebRequest中 
     */ 
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		logger.info("进入拦截器");
		logger.info(request.getParameterNames());

		//获取url地址
        String reqUrl=request.getRequestURI().replace(request.getContextPath(), "");
		logger.info(reqUrl);
        //当url地址为登录的url的时候跳过拦截器  
        /*if(reqUrl.contains("/page")){
        	if (request.getParameter("__RequestVerificationToken") == null
                    || request.getSession().getAttribute(CSRFTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME) == null
                    || !request.getParameter("__RequestVerificationToken").equals(request.getSession().getAttribute(CSRFTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME).toString())) {
        		HttpSession session = request.getSession();
    	        CSRFTokenManager.getTokenForSession(session);
        		response.sendRedirect("/login");
        		return false;
            }
        }*/
        //如果访问的不是登录相关页面和服务，则检验是否登录
  		/*if(reqUrl.toLowerCase().indexOf("login")<0){
  			HttpSession session = request.getSession();
  			Users loginFlag = (Users)session.getAttribute(Code.loginFlagName);

  			//如果没有登录，则页面跳转到登录页面
			if(loginFlag == null){

				response.sendRedirect("/login"); 
				return false;
			}else {

				if(loginFlag.getRoleid() == 3 || loginFlag.getRoleid() == 4 || loginFlag.getRoleid() == 12) {
					request.getSession().setMaxInactiveInterval(3600 * 3);
				}
			}
			String cp = request.getContextPath();
			String operationUri = reqUrl.substring(cp.length());
			//验证操作权限
			@SuppressWarnings("unchecked")
			Map<Integer,Integer> permissionMap = (Map<Integer,Integer>)session.getAttribute(Code.userPermission);
			ModulePermission modulePermission = (ModulePermission)usersMapper.getPermissionValue(operationUri);
			if(modulePermission != null){
				int permissionValue = modulePermission.getPermissionvalue().intValue();
				//获得用户拥有的当前模块的操作权限
				Integer userModulePermission = permissionMap.get(modulePermission.getModuleid());
				
				if( userModulePermission == null || (permissionValue & userModulePermission) == 0){
					response.getWriter().write("no_permission");
					return false;
				}
			}
			recordUserOperation(request, loginFlag, reqUrl, modulePermission);
  		}*/
        return true;
    }  
  
    /** 
     * 该方法将在Controller执行之后，返回视图之前执行，ModelMap表示请求Controller处理之后返回的Model对象，所以可以在 
     * 这个方法中修改ModelMap的属性，从而达到改变返回的模型的效果。 
     */  
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o,  
            ModelAndView mav) throws Exception {
        //获取url地址  
        String reqUrl=request.getRequestURI().replace(request.getContextPath(), "");
        //当url地址为登录的url的时候跳过拦截器  
        if(reqUrl.contains("/login")){
        	HttpSession session = request.getSession();
	        CSRFTokenManager.getTokenForSession(session);
    	}
    }  
  
    /** 
     * 该方法将在整个请求完成之后，也就是说在视图渲染之后进行调用，主要用于进行一些资源的释放 
     */  
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o,  
            Exception excptn) throws Exception {  
        // System.out.println("afterCompletion");  
    }
    
    private void recordUserOperation(ServletRequest request, Users user, String operationUri, ModulePermission permission) {
		
		Date logTime = new Date();
		
		String paramters = "";
		try {
			paramters = JSON.json(request.getParameterMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
		UserOperatationLog log = new UserOperatationLog();
		log.setInserttime(logTime);
		log.setUserid(user.getUserid());
		log.setPermissionvalue(permission == null ? 0 : permission.getPermissionvalue());
		log.setModuleid(permission == null ? 0 : permission.getModuleid());
		log.setUri(operationUri);
		if(paramters.length() >= 1000)
			paramters = paramters.substring(0, 999);
		log.setParamters(paramters);
		
		java.text.SimpleDateFormat sf = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
		Map<String, String> operaMap = usersMapper.getOperationModulePermissionNames(log.getModuleid(), log.getPermissionvalue());
		if(operaMap != null && !operaMap.isEmpty()) {
			String moduleName = operaMap.get("moduleName"), type = operaMap.get("permissionName");
			log.setOperationtype(Integer.parseInt(type));
			//OperationTypeEnum ope = OperationTypeEnum.valueOf(type);
			//ope.getOperationText(user.getUsername(), logTime, moduleName, request.getParameterMap());
			log.setDescription(user.getUsername() + "在" + sf.format(logTime) + type + "了" + moduleName);
			
		} else {
			log.setDescription(user.getUsername() + "在" + sf.format(logTime) + "访问了" + operationUri);
		}
		logWriter.addLog(log);
	}

}
