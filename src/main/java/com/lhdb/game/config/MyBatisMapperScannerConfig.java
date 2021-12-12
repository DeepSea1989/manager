package com.lhdb.game.config;

import com.lhdb.game.config.TestConfig;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(TestConfig.class)
public class MyBatisMapperScannerConfig {

    //com.tao.book.mapper.* 需要换成自己项目中持久层的路径
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() throws Exception{
        System.out.println("扫描mapper");
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        System.out.println("扫描mapper----dao");
        mapperScannerConfigurer.setBasePackage("com.gitee.sunchenbin.mybatis.actable.dao.*;com.lhdb.game.dao.*");
        System.out.println("结束扫描mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }

}
