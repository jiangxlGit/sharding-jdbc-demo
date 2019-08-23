package com.fanxb.sjdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = "com.fanxb.sjdemo.dao")
@EnableSwagger2
public class SjdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjdemoApplication.class, args);
    }

}
