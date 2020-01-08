package com.virugan.intercept;


import com.virugan.myUtlis.myBeanUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class myLogInterceptor {


    //拦截交易入口，登记交易请求信息
    @Around("execution(* com.virugan.trans.*.execute(..))")
    public Object transLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("debug >>>> "+ LocalDateTime.now()+" >>>>>>>>>>>>>>> "+
                   pjp.getSignature().getDeclaringTypeName()+ " >>>>>>>>>>>>>>>");

        Object[] args = pjp.getArgs();
        for(Object param:args){
            System.out.println("debug >>>> "+ param.getClass().getSimpleName()+" :["+
                    myBeanUtils.objectToMap(param)+"]");
        }

        Object result= pjp.proceed();

        System.out.println("debug <<<< "+ result.getClass().getSimpleName()+" :["+
                myBeanUtils.objectToMap(result)+"]");

        System.out.println("debug <<<< "+ LocalDateTime.now()+" <<<<<<<<<<<<<<< "+
                pjp.getSignature().getDeclaringTypeName()+ " <<<<<<<<<<<<<<<");

        return result;
    }

    //拦截servimpl，登记请求信息
    @Around("execution(* com.virugan.servimpl.*.*(..))")
    public Object servLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("debug >>>> "+ LocalDateTime.now()+" >>>>>>>>>>>>>>> "+pjp.getSignature().getDeclaringTypeName()+
                " : "+pjp.getSignature().getName()+" >>>>>>>>>>>>>>>");

        Object[] args = pjp.getArgs();
        for(Object param:args){
            System.out.println("debug >>>> "+ param.getClass().getSimpleName()+" :["+
                    myBeanUtils.objectToMap(param)+"]");
        }

        Object result= pjp.proceed();

        System.out.println("debug <<<< "+ result.getClass().getSimpleName()+" :["+
                myBeanUtils.objectToMap(result)+"]");

        System.out.println("debug <<<< "+ LocalDateTime.now()+" <<<<<<<<<<<<<<< "+pjp.getSignature().getDeclaringTypeName()+
                " : "+pjp.getSignature().getName()+" <<<<<<<<<<<<<<<");

        return result;
    }

    //webservImpl，登记请求信息
    @Around("execution(* com.virugan.webservImpl.*.*(..))")
    public Object webservLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("debug >>>> "+ LocalDateTime.now()+" >>>>>>>>>>>>>>> "+pjp.getSignature().getDeclaringTypeName()+
                " : "+pjp.getSignature().getName()+" >>>>>>>>>>>>>>>");

        Object[] args = pjp.getArgs();
        for(Object param:args){
            System.out.println("debug >>>> "+ param.getClass().getSimpleName()+" :["+
                    myBeanUtils.objectToMap(param)+"]");
        }

        Object result= pjp.proceed();

        System.out.println("debug <<<< "+ result.getClass().getSimpleName()+" :["+
                myBeanUtils.objectToMap(result)+"]");

        System.out.println("debug <<<< "+ LocalDateTime.now()+" <<<<<<<<<<<<<<< "+pjp.getSignature().getDeclaringTypeName()+
                " : "+pjp.getSignature().getName()+" <<<<<<<<<<<<<<<");

        return result;
    }
}
