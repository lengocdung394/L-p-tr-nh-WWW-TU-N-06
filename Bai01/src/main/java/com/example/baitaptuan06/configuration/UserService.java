package com.example.baitaptuan06.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserService {


    @Bean
    public Group groupService(){
       return  new Group("groupService", 1);
    }

    @Bean
    public User userService1(){
        return new User("Le Ngoc Dung", "12435#",groupService(),1);
    }
}
