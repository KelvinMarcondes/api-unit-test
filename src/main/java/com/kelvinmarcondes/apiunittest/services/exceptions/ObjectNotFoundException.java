package com.kelvinmarcondes.apiunittest.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String message){
        super(message);
    }
}
