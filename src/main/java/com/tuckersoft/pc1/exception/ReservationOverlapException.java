package com.tuckersoft.pc1.exception;

public class ReservationOverlapException extends RuntimeException {
    public ReservationOverlapException(String message) {
        super("Reserva superpuesta");
    }
}
