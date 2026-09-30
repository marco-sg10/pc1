package com.tuckersoft.pc1.exception;

public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException(String message) {
        super("Los credenciales no son validos");
    }
}
