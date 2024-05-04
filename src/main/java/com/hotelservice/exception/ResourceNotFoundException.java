package com.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException() {
        super();
    }
    public ResourceNotFoundException(String mess) {
        super(mess);
    }

}
