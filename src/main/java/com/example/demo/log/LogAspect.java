package com.example.demo.log;

import org.aspectj.lang.annotation.AfterReturning;
// import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;



@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(public * com.example.demo.service.ItemService.*(..))")
    private void pointCut(){};

    @Before("pointCut()")
    public void beforeItemService() {
        System.out.println("Begin Log Aspect:");
    }


    @AfterReturning("pointCut()")
    public void afterReturnItemService() {
        System.out.println("After Log Aspect Return");
    }
}
