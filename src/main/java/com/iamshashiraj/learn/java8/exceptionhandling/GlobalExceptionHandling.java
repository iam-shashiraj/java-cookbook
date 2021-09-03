package com.iamshashiraj.learn.java8.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {

    @ExceptionHandler(NoSuchFieldException.class)
    public ResponseEntity<String> handleFieldMissing(NoSuchFieldException e){
        return new ResponseEntity<String>("The field specified by you doesn't exist", HttpStatus.NOT_FOUND);
    }

    /*@Override
    protected ResponseEntity<String> handleHttpRequestMethodNotSupported(){
        return new ResponseEntity<String>("The field specified by you doesn't exist", HttpStatus.NOT_FOUND);
    }*/

}
