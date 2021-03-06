package com.example.qanda.demo.qanda.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//------[CREATED BY @kushan] 2020-10-02

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException{
    private String exceptionDetail;
    private Object fieldValue;


    public RecordNotFoundException( String exceptionDetail, Long fieldValue) {
        super(exceptionDetail+" - "+fieldValue);
        this.exceptionDetail = exceptionDetail;
        this.fieldValue = fieldValue;
    }

    public String getExceptionDetail() {
        return exceptionDetail;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

}
