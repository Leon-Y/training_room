package cn.pinming.trainingroom.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :14:38
 * @Description:
 */
@Data
@ConfigurationProperties(prefix = ProductizationProperties.PREFIX)
@Component
public class ProductizationProperties implements DataSourceProperties{

    static final  String PREFIX="spring.datasource.productization";

    private String url;
    private String userName;
    private String password;
    private String driverClassName;
}


