package com.bishe.Exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = Exception.class)
    public void handleGlobalException(HttpServletRequest req, Exception e) {
        //打印异常信息：
        //e.printStackTrace();
        System.out.println(e.getMessage());
    }

}