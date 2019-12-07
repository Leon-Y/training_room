package com.pinming.training_room.configuration.properties;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :14:46
 * @Description:
 */
public interface DataSourceProperties {

    /**
     * 获取url
     * @return
     */
    String getUrl();

    /**
     * 获取用户名称
     * @return
     */
    String getUserName();

    /**
     * 获取密码
     * @return
     */
    String getPassword();

    /**
     * 获取驱动名称
     * @return
     */
    String getDriverClassName();
}
