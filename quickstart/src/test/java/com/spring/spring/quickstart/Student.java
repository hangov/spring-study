package com.spring.spring.quickstart;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
采用注解和Lombok开发的Student类
 */
@Component
@Data
public class Student {
    @Value("Tom")
    private String name;

    @Value("20")
    private int age;

//    使用@Autowired注入一个Phone类型的bean
    @Autowired
    private Phone phone;
}
