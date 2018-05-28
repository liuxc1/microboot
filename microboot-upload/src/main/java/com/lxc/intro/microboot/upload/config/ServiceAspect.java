package com.lxc.intro.microboot.upload.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 面向切面
 */
@Aspect
@Component
public class ServiceAspect {
	@Pointcut("execution(* com.lxc.intro.microboot.upload..*.*Service.*(..))")//配置切入点
    public void pointCut(){}
    
    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("AOP Before Advice...");
    }
    
    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("AOP After Advice...");
    }
    
    @AfterReturning(pointcut="pointCut()",returning="returnVal")
    public void afterReturn(JoinPoint joinPoint,Object returnVal){
        System.out.println("AOP AfterReturning Advice:" + returnVal);
    }
    
    @AfterThrowing(pointcut="pointCut()",throwing="error")
    public void afterThrowing(JoinPoint joinPoint,Throwable error){
        System.out.println("AOP AfterThrowing Advice..." + error);
        System.out.println("AfterThrowing...");
    }
    
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp){
        System.out.println("AOP Aronud before...");
        try {
            Object proceed = pjp.proceed(pjp.getArgs());
            return proceed;
        } catch (Throwable e) {
            e.printStackTrace();
        }finally {
        	System.out.println("AOP Aronud after...");
		}
		return null;
    }
}
