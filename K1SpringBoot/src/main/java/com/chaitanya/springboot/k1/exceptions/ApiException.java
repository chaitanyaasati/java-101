package com.chaitanya.springboot.k1.exceptions;

public class ApiException extends RuntimeException{

    public ApiException(String message){
        super(message);
    }

    public ApiException(){
        super();
    }
}
