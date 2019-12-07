package com.pinming.training_room.configuration;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :14:10
 * @Description:
 */
@Component
public class SpringContextHolder implements ApplicationContextAware {

    /**
     * 容器
     */
    private static ApplicationContext applicationContext;

    /**
     * 获取容器
     * @return
     */
    private static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    /**
     * 获取bean
     * @param beanName
     * @return
     */
    public static <T> T getBean(String beanName){
        return (T) applicationContext.getBean(beanName);
    }

    /**.
     * 获取多个bean
     */
    public static <T> Map<String,T>  getBeans(Class<T> clazz){
        Map<String, T> beansOfType = applicationContext.getBeansOfType(clazz);
        return beansOfType;
    }

    /**
     * 继承父类set，提供给spring注入application
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
    }
}
