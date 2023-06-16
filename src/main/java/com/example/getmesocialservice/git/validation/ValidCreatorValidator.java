package com.example.getmesocialservice.git.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidCreatorValidator implements ConstraintValidator<ValidCreator,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        if (s.matches("[a-z0-9]+$")){
            return true;
        }else{
            return false;
        }

    }
}

