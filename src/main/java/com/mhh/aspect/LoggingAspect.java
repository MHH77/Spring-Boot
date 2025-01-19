package com.mhh.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(*  com.mhh.service.StudentService.insertStudent(..))")//execute in any class
    public void beforeInsertStudent() {

        System.out.println("\n=====>>> Executing @Before advice on insertStudent()");

    }
}
