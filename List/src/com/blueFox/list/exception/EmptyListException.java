package com.blueFox.list.exception;

public class EmptyListException extends Exception{
    public EmptyListException() {
        super();
    }

    public EmptyListException(String message){
        super(message);
    }
}
