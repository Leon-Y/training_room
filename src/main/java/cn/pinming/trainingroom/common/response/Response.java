package cn.pinming.trainingroom.common.response;

/**
 * @Author: Administrator
 * @Date: 2019/12/8 :11:21
 * @Description:
 */
public interface Response {

    /**
     * 获取消息
     * @return
     */
    String getMessage();

    /**
     * 获取code
     * @return
     */
    String getCode();

    /**
     * 获取数据
     * @return
     */
    Object getData();
}
