package com.example.socialkata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SocialKataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialKataApplication.class, args);
    }


}
