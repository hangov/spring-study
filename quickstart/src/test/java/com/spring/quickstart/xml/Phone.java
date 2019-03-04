package com.spring.quickstart.xml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
采用注解和Lombok开发的Phone类
 */
@Component
@Data
public class Phone {
    @Value("iPhoneX")
    private String brand;

    @Value("666666")
    private double price;
}
