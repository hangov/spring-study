package com.spring.spring.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        Tiger tiger = context.getBean(Tiger.class);
        tiger.walk();
    }
}
