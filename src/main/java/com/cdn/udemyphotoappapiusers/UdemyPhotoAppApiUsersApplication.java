package com.cdn.udemyphotoappapiusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UdemyPhotoAppApiUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyPhotoAppApiUsersApplication.class, args);
    }

}
