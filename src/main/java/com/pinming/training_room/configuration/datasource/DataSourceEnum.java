package com.pinming.training_room.configuration.datasource;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :14:26
 * @Description:
 */
public enum DataSourceEnum {

    PRODUCTION(DataSourceEnum.PRODUCTION_NAME)
    ;

    DataSourceEnum(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    /**
     * 数据源名称
     */
    private String datasourceName;

    private String getDatasourceName(){
        return this.datasourceName;
    }

    /**
     * 产品化数据库名称
     */
    private static final String PRODUCTION_NAME = "productization";
}
