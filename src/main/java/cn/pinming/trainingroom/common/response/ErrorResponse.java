package cn.pinming.trainingroom.common.response;

import cn.pinming.trainingroom.common.exception.TrainingException;

/**
 * @Author: Administrator
 * @Date: 2019/12/8 :11:35
 * @Description:
 */
public class ErrorResponse implements Response {

    private String code;

    private String success;

    private String message;

    private String data;

    public ErrorResponse(TrainingException exception) {
        this(exception.getCode(),exception.getMessage());
    }

    public ErrorResponse(String code,String message) {
        this(code,message,null);
    }

    public ErrorResponse(String code,String message, String data) {
        this.code = code;
        this.success = "false";
        this.message = message;
        this.data = data;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "code='" + code + '\'' +
                ", success='" + success + '\'' +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
