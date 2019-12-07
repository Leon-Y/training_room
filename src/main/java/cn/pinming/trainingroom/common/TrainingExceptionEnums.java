package cn.pinming.trainingroom.common;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :16:59
 * @Description:
 */
public enum TrainingExceptionEnums {
    /**
     * 服务器异常信息 500
     */
    DATASOURCE_NOT_EXSIST("5001","数据存在问题"),


    /**
     * 请求错误 400
     */


    /**
     * 未知错误 600
     */
    UNKNOWN_ERROR("6001","未知错误")
    ;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMessage;

    TrainingExceptionEnums(String errorCode,String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
