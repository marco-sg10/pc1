package com.tuckersoft.pc1.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super("El usuario ya existe");
    }
}
