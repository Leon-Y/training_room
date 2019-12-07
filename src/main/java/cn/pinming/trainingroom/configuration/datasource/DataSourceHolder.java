package cn.pinming.trainingroom.configuration.datasource;

import cn.pinming.trainingroom.configuration.properties.DataSourceProperties;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :14:17
 * @Description:
 */
@Configuration
public class DataSourceHolder {

    /**
     * 产品化数据库
     * @return
     */
    @Bean("productization")
    @ConfigurationProperties(prefix = "producti.datasource.productization")
    public DataSource productizationDatasource(DataSourceProperties properties) {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(properties.getUrl());
        hikariDataSource.setUsername(properties.getUserName());
        hikariDataSource.setPassword(properties.getPassword());
        hikariDataSource.setDriverClassName(properties.getDriverClassName());
        return hikariDataSource;
    }
}
