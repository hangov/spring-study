package com.spring.quickstart.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ComponentScan用于寻找@Component注解标准的bean
 */
@ComponentScan
public class HelloApp {
    public static void main(String[] args){
//        通过注解创建上下文对象
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloApp.class);
//        读取bean
        Hello hello = context.getBean(Hello.class);
//        运行
        System.out.println(hello.getHello());
    }

}
