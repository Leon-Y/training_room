package cn.pinming.trainingroom.configuration.datasource;

/**
 * @Auther: Xiao
 * @Date: 2019/2/19 0019 :10:20
 * @Description:根据注解类型动态配置数据源
 */
public class MultipleDataSourceHandler {
    private static ThreadLocal<String> handlerThredLocal = new ThreadLocal<String>();

    /**
     * @desction: 提供给AOP去设置当前的线程的数据源的信息
     * @author:
     * @date:
     * @param: [datasource]
     * @return: void
     */
    public static void putDataSource(String datasource) {
        handlerThredLocal.set(datasource);
    }

    /**
     * @desction: 提供给AbstractRoutingDataSource的实现类，通过key选择数据源
     * @author:
     * @date:
     * @param: []
     * @return: java.lang.String
     */
    public static String getDataSource() {
        return handlerThredLocal.get();
    }

    /**
     * @desction: 使用默认的数据源
     */
    public static void clear() {
        handlerThredLocal.remove();
    }

}
