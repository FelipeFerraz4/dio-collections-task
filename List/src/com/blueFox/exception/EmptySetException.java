package com.blueFox.exception;

public class EmptySetException extends Exception {
    public EmptySetException() {
        super();
    }

    public EmptySetException(String message) {
        super(message);
    }
}
