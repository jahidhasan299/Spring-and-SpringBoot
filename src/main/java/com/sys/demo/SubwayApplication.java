package com.sys.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan(basePackages="com.sys.demo.dao")
public class SubwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubwayApplication.class, args);
    }
    protected  SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return  application.sources(SubwayApplication.class);
     }
}
