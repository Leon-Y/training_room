package cn.pinming.trainingroom.configuration.datasource;

import cn.pinming.trainingroom.common.TrainingException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :16:20
 * @Description:
 */

@Aspect
public class MultipleDataSourceAop {

    @Pointcut(value = "@annotation(cn.pinming.trainingroom.configuration.datasource.MultipleAnotation)")
    public void cut(){

    }

    @Around("cut()")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint){
        String dataSourceName;
        MethodSignature signature = (MethodSignature)proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        MultipleAnotation annotation = method.getAnnotation(MultipleAnotation.class);
        if (annotation != null){
            dataSourceName = annotation.value();
        }else {
            Class clazz = proceedingJoinPoint.getClass();
            if (clazz.isAnnotationPresent(MultipleAnotation.class)){

            }else{
                throw new TrainingException();
            }
        }
        return null;
    }
}
