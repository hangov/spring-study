package com.spring.spring.quickstart;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

/**
 * 用户自定义得前置增强类
 */
public class MyBeforeAdvice {
//    private static final Logger logger = (Logger) LoggerFactory.getLogger(MyBeforeAdvice.class);
//    定义前置方法
    public void beforeMethod(){
   //    logger.debug("This is a before method by zzh");
      System.out.println("This is a before method");
    }
}
