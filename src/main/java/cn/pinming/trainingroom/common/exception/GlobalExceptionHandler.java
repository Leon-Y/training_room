package cn.pinming.trainingroom.common.exception;

import cn.pinming.trainingroom.common.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Administrator
 * @Date: 2019/12/8 :11:46
 * @Description:
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 拦截业务异常
     */
    @ExceptionHandler(value = TrainingException.class)
    public ResponseEntity serviceExceptionHandler(TrainingException exception){
        log.error(exception.getCode() +":"+ exception.getMessage());
        return ResponseEntity.ok(new ErrorResponse(exception));
    }
}
