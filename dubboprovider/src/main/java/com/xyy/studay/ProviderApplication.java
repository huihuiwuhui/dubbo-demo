package com.xyy.studay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther: Administrator
 * @Date: 2018/6/13 19:33
 * @Description:
 */
@SpringBootApplication
@ImportResource("classpath:/dubbo.xml")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
