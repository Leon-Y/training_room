package cn.pinming.trainingroom.common.response;

/**
 * @Author: Administrator
 * @Date: 2019/12/8 :11:24
 * @Description:
 */
public class SuccessResponse implements Response {

    private String code ;
    private String success;
    private Object data;

    public SuccessResponse(Object data) {
        this("",data);
    }

    public SuccessResponse(String code, Object data) {
        this.code = code;
        this.success = "true";
        this.data = data;
    }

    @Override
    public String getMessage() {
        return success;
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
        return "SuccessResponse{" +
                "code='" + code + '\'' +
                ", success='" + success + '\'' +
                ", data=" + data +
                '}';
    }
}
