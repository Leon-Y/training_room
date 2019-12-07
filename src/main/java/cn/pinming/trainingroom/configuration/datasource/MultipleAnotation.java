package cn.pinming.trainingroom.configuration.datasource;

import lombok.Builder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :16:24
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface MultipleAnotation {

    /**
     * 数据源名称 默认产品化数据源
     */
    String value() default  "productization";
}
