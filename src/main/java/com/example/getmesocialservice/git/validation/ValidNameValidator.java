package com.example.getmesocialservice.git.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidNameValidator implements ConstraintValidator<ValidName,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        if (s.matches( "[a-zA-Z .]+")) {
            return true;
        }else{
            return false;
        }

    }
}
