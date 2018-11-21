package cn.dawnland.serverin8762;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DServerIn8763Application {

    public static void main(String[] args) {
        SpringApplication.run(DServerIn8763Application.class, args);
    }
}
