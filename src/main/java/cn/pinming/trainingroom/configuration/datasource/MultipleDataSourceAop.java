package cn.pinming.trainingroom.configuration.datasource;

import cn.pinming.trainingroom.common.exception.TrainingException;
import cn.pinming.trainingroom.common.exception.TrainingExceptionEnums;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

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
        /**
         * 获取方法上的注解
         */
        MethodSignature signature = (MethodSignature)proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        MultipleAnotation annotation = method.getAnnotation(MultipleAnotation.class);
        if (annotation != null){
            dataSourceName = annotation.value();
        }else {
            /**
             * 获取类上的注解
             */
            Class clazz = proceedingJoinPoint.getClass();
            if (clazz.isAnnotationPresent(MultipleAnotation.class)){
                MultipleAnotation annotationClass = (MultipleAnotation) clazz.getAnnotation(MultipleAnotation.class);
                dataSourceName = annotation.value();
            }else{
                throw new TrainingException(TrainingExceptionEnums.DATASOURCE_NOT_EXSIST);
            }
        }

        /**
         * 执行数据源切换
         */
        MultipleDataSourceHandler.putDataSource(dataSourceName);
        try {
            Object proceed = proceedingJoinPoint.proceed();
            /**
             * 恢复默认的数据源
             */
            MultipleDataSourceHandler.clear();
            return proceed;
        } catch (Throwable throwable) {
            throw new TrainingException(throwable);
        }

    }
}
