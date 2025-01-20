package com.mhh.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(boolean com.mhh.service.*.add*(..))")//execute only methods that return boolean
    public void beforeInsertStudent() {

        System.out.println("\n=====>>> Executing @Before advice on add*()");

    }
}
