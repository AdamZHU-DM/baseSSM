package com.nxdomax.ssm.v101.iinterface.aspact.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @Author: Adam ZHU
 * @Date: 2020/10/10 23:39
 */


@Component   // 注释掉是为了不上spring扫描，而是让springmvc去扫描
@Aspect
public class ProductDaoAspect {

    @Pointcut("@annotation(com.nxdomax.ssm.v101.iinterface.AProUser)")
    public void validateUserAspectPointcut(){}

//
//    @Before("execution(* *..*.IProductDao.*())")
//    public void before(){
//        System.out.println("===============-----------5555-----0000000000000000");
//    }

//    @Before("validateUserAspectPointcut()")
//    public void before(){
//        System.out.println("ProductDaoAspect.before");
//    }


    @Around("validateUserAspectPointcut()")
    public Object arround(ProceedingJoinPoint joinPoint) {

        boolean isFlag = false;
        System.out.println("ProductDaoAspect.arround");
        Object resultObj = "您的用户信息异常，非法操作";
        try {
            if(isFlag) {
                resultObj = joinPoint.proceed();
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return  resultObj;
    }
}
