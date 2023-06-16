package com.example.getmesocialservice.git.exception;

public class RestrictedInfoException extends Exception{
    @Override
    public String getMessage() {
        return "Classified Information...";
    }
}
