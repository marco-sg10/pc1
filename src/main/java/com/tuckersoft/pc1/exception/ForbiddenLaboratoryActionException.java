package com.tuckersoft.pc1.exception;

public class ForbiddenLaboratoryActionException extends RuntimeException {
    public ForbiddenLaboratoryActionException(String message) {
        super("Acción no permitida rol insuficiente o laboratorio ajeno");
    }
}
