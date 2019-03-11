package com.spring.spring.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ImageCopyApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        ImageCopy imageCopy = context.getBean(ImageCopy.class);
        try{
            imageCopy.copyImage();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
