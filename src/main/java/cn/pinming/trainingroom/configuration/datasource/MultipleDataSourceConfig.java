package cn.pinming.trainingroom.configuration.datasource;

import cn.pinming.trainingroom.configuration.SpringContextHolder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :13:50
 * @Description:
 */
@Configuration
public class MultipleDataSourceConfig {

    /**
     * 多数据源配置
     * @return
     */
    @Bean
    @Primary
    public DynamicDataSource dynamicDataSource(@Qualifier("productization") DataSource defaultDataSource){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        /**
         * 设置默认数据源
         */
        dynamicDataSource.setDefaultTargetDataSource(defaultDataSource);

        /**
         * 设置数据源池
         */
        Map<String, DataSource> beans = SpringContextHolder.getBeans(DataSource.class);
        HashMap<Object, Object> targetDataSource = new HashMap<>();
        for (String name:beans.keySet()){
            targetDataSource.put(name,beans.get(name));
        }
        dynamicDataSource.setTargetDataSources(targetDataSource);
        return dynamicDataSource;
    }
}
