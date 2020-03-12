package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname EureKaMain7003
 * @Description TODO
 * @Date 2020/3/12 13:33
 * @Created by Administrator
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKaMain7003 {
    public static void main(String[] args) {

        SpringApplication.run(EureKaMain7003.class,args);
    }
}
