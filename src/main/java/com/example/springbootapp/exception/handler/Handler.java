package com.example.springbootapp.exception.handler;

import com.example.springbootapp.exception.ProductNotfoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Handler {
    @ExceptionHandler(value = ProductNotfoundException.class)
    public ResponseEntity<Object> exception(ProductNotfoundException e)
    {
        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }
}
