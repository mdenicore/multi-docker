package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@SpringBootApplication
public class HelloWorldApp {
 
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);
    }
}

@RestController
class HelloDockerRestController {
    @RequestMapping("/hello")
    public String helloDocker() {
        String response = "Hello !";
        System.out.println(response);
        return response;
 
    }
}