package com.tuckersoft.pc1.exception;

public class SlotUnavailableException extends RuntimeException {
    public SlotUnavailableException(String message) {
        super("Turno sin capacidad o cancelado");
    }
}
