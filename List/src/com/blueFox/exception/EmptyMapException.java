package com.blueFox.exception;

public class EmptyMapException extends Exception {
    public EmptyMapException() {
        super();
    }

    public EmptyMapException(String message) {
        super(message);
    }
}
