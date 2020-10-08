package com.praxis.management.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadedFileExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String fileUploadedExceptionHandler(MaxUploadSizeExceededException exception, HttpServletRequest request, HttpServletResponse response){
        return "File Size limit exceeded. Please make sure the file size is well within 128KB;";
    }

}
