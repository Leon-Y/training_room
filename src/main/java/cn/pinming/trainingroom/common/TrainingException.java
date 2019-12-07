package cn.pinming.trainingroom.common;

/**
 * @Author: Administrator
 * @Date: 2019/12/7 :16:57
 * @Description:
 */
public class TrainingException extends RuntimeException {

    public TrainingException() {
        super();
    }

    public TrainingException(String message) {
        super(message);
    }

    public TrainingException(TrainingExceptionEnums trainingExceptionEnums){
        super(trainingExceptionEnums.getErrorCode()+":"+trainingExceptionEnums.getErrorMessage());
    }

    public TrainingException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrainingException(Throwable cause) {
        super(cause);
    }
}
