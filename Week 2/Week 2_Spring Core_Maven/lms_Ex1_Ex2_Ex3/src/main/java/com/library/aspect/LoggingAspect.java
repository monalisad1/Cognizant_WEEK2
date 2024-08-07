package com.library.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.message(..))")
    public void logBefore() {
        System.out.println("LoggingAspect: Before method execution");
    }
}
