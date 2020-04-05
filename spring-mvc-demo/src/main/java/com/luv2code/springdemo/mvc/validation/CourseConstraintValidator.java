package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseConstraintValidator implements ConstraintValidator<CourseCode, String> {

   private String coursePrefix;

   @Override
   public void initialize(CourseCode courseCode) {
      coursePrefix = courseCode.value();
   }

   public boolean isValid(String code, ConstraintValidatorContext context) {

      boolean result;

      if(code != null){
         result = code.startsWith(coursePrefix);
      }else {
         result =true;
      }

      return result;
   }
}
