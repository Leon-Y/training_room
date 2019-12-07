package cn.pinming.trainingroom.configuration.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :13:54
 * @Description:
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return MultipleDataSourceHandler.getDataSource();
    }
}
