package cn.xuank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:applicationContext-service.xml","classpath:applicationContext-activemq.xml","classpath:applicationContext-dao.xml","classpath:applicationContext-redis.xml","classpath:applicationContext-trans.xml"})
public class ScManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScManagerServiceApplication.class, args);
    }

}
