package com.virugan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.virugan.mapper")
public class pyTranCenter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(pyTranCenter.class, args);
    }
}