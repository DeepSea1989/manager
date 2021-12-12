package com.lhdb.game.config;

import com.lhdb.game.controller.PlayerController;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {


    Logger logger = Logger.getLogger(PlayerController.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("进入拦截器1");
        registry.addInterceptor(new PageInterceptor());

        System.out.println("开始开始咯。。。。");
    }
}
