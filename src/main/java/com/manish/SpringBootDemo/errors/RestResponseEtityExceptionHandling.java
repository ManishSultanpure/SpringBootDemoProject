package com.manish.SpringBootDemo.errors;

import com.manish.SpringBootDemo.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEtityExceptionHandling extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EmployeeNotFound.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFound(EmployeeNotFound emp){
    return new ErrorMessage(HttpStatus.NOT_FOUND,emp.getMessage());
    }
}
