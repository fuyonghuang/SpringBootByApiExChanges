package com.sic.utils.controler;


import com.sic.utils.exception.CustomException;
import com.sic.utils.response.ResponseBodyHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Map;

/**
 * 通用异常处理配置类
 * <p>
 * 1. 自定义异常返回{errorCode, result: {errorMsg}}
 * 2. 未知异常返回{errorCode: "-1", result: {errorMsg}}
 * 应用在抛出异常时自动返回500
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Map handleError(Exception e) {
        return ResponseBodyHelper.fail("-1", e.getMessage());
    }

    @ExceptionHandler(value = CustomException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Map handleCustomError(CustomException e) {
        return ResponseBodyHelper.fail(e.getErrorCode(), e.getMessage());
    }

    @ExceptionHandler(value = ParseException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Map handleDateError(ParseException e) {
        return ResponseBodyHelper.fail("500000", e.getMessage());
    }

    @ExceptionHandler(value = SQLException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Map handleDateError(SQLException e) {
        return ResponseBodyHelper.fail("500000", e.getMessage());
    }

    @ExceptionHandler(value = HttpMediaTypeNotSupportedException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Map handleDateError(HttpMediaTypeNotSupportedException e) {
        return ResponseBodyHelper.fail("300001", "contentType 设置不正确");
    }
}
