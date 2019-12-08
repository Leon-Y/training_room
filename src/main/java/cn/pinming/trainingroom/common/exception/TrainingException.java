package cn.pinming.trainingroom.common.exception;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :16:57
 * @Description:
 */
public class TrainingException extends RuntimeException {

    private String code = "";

    private String message = "";

    public TrainingException() {
        super();
    }

    public TrainingException(String message) {
        super(message);
        this.message = message;
    }

    public TrainingException(TrainingExceptionEnums trainingExceptionEnums){
        super(trainingExceptionEnums.getErrorCode()+":"+trainingExceptionEnums.getErrorMessage());
        this.code = trainingExceptionEnums.getErrorCode();
        this.message = trainingExceptionEnums.getErrorMessage();
    }

    public TrainingException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public TrainingException(Throwable cause) {
        super(cause);
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
