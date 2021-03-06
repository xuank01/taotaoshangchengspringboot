package cn.xuank.controller;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:webdubbo.xml"})
public class ScManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScManagerWebApplication.class, args);
    }

}
