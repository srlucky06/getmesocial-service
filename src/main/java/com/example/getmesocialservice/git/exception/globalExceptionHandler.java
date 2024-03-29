package com.example.getmesocialservice.git.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.util.NoSuchElementException;
@ControllerAdvice
public class globalExceptionHandler  {

    @ExceptionHandler(RestrictedInfoException.class)
    public ResponseEntity<String> restrictedInfoError(RestrictedInfoException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> noSuchElementError(){
        return new ResponseEntity<>("No such element found", HttpStatus.CONFLICT);
    }
}
