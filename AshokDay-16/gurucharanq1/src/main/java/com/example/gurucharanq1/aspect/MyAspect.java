package com.example.gurucharanq1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.gurucharanq1.service.MyService;

@Configuration
@Aspect
public class MyAspect {
    
    @Autowired
    public MyService myService;

    @Before("execution(* com.example.gurucharanq1.controller..*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        myService.doSomething();
    }

    @After("execution(* com.example.gurucharanq1.controller..*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        myService.doSomething();
    }

    @Around("execution(* com.example.gurucharanq1.controller..*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        myService.doSomething();
        Object result = joinPoint.proceed();
        myService.doSomething();
        return result;
    }
}
