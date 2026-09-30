package com.tuckersoft.pc1.exception;

public class LaboratoryNotFoundException extends RuntimeException {
    public LaboratoryNotFoundException(String message) {
        super("LabId inexistente");
    }
}
