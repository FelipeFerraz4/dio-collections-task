package com.blueFox.list.basicOperation.exception;

public class EmptyTaskListException extends Exception{
    public EmptyTaskListException() {
        super();
    }

    public EmptyTaskListException(String message){
        super(message);
    }
}
