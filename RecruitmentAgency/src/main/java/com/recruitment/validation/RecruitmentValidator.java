package com.recruitment.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.beanvalidation.CustomValidatorBean;

import com.recruitment.model.Candidate;


public class RecruitmentValidator extends CustomValidatorBean {

	@Override
    public boolean supports(Class<?> clazz) {
    return Candidate.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
          super.validate(target, errors);
    
    	  
        } 
}