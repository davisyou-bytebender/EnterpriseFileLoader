package com.aliyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author davis you
 * @Date 2022/8/9 7:31 PM
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.aliyun.dao")
public class EnterpriseFileApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnterpriseFileApplication.class,args);
    }
}
