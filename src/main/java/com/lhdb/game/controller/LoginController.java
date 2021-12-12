package com.lhdb.game.controller;


import com.lhdb.game.dao.UsersMapper;
import com.lhdb.game.entity.Users;
import com.lhdb.util.*;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RestController
@RequestMapping(value="/v1")
public class LoginController {

    private GoogleAuthenticator ga = new GoogleAuthenticator();

    @Resource
    private UsersMapper usersMapper;

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    Logger logger = Logger.getLogger(PlayerController.class);

    @RequestMapping(value = "/userLogin")
    public Result userLogin(String username, String password, String ip){

        try {
            password = MD5Util.MD5(password);

            logger.info(password);

            Users users = new Users();
            users.setUsername(username);
            users.setPassword(password);
            List<Users> userList = usersMapper.selectWithSpreader(users);

            if (userList.size() > 0) {

                Users user = userList.get(0);
                if(user.getIsband() == 1) {
                    if(!user.getBandip().equals(ip)) {
                        return ResultUtil.error(20001, "该用户已绑定IP!");
                    }
                }

                if(user.getNullity() == 1) {
                    return ResultUtil.error(20002, "该用户已被冻结！");
                }

                user.setPreloginip(user.getLastloginip());
                user.setPrelogintime(user.getLastlogintime());
                user.setLastloginip(ip);
                user.setLastlogintime(new java.util.Date());
                user.setLogintimes(user.getLogintimes() == null ? 1 : user.getLogintimes() + 1);
                //
                return ResultUtil.success(user);

                //
//                List<Module> modules = usersMapper.getUserMenu(user.getUserid());
//                session.setAttribute(Code.userMenu, modules);

//                List<ModulePermission> permissions = usersMapper.getUserPermission(user.getUserid());
//                Map<Integer,Integer> permissionMap = new HashMap<Integer,Integer>();
//                for(ModulePermission up:permissions){
//                    permissionMap.put(up.getModuleid(), up.getPermissionvalue().intValue());
//                }
//                session.setAttribute(Code.userPermission, permissionMap);

            } else {
                return ResultUtil.error(20003, "用户名或密码错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(20004,"系统错误");
        }
    }
}
