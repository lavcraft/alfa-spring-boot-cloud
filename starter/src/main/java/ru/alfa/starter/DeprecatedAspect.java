package ru.alfa.starter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Aspect
public class DeprecatedAspect {
    @Autowired ObjectProvider<EmailService> emailService;

    @Around("execution(* ru.alfa.*.*.*(..)) && @annotation(java.lang.Deprecated)")
    public void processDeprecated(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("----- i am frog ----");
        emailService.ifAvailable(emailService1 -> {
            emailService1.sendEmail();
        });
        proceedingJoinPoint.proceed();
    }



}

