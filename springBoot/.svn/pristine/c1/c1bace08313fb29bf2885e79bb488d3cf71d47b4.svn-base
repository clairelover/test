package com.jiashi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by wugongjiang on 2017/5/21.
 */
// Spring Boot 应用的标识
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.jiashi.dao")
public class SpringBootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
       return builder.sources(SpringBootApplication.class);
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SpringBootApplication.class,args);
    }
}
