package com.tuckersoft.pc1.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ForbiddenLaboratoryActionException.class)
    public String handleForbiddenLaboratoryActionException(ForbiddenLaboratoryActionException ex) {
        return ex.getMessage();
    }
    @ExceptionHandler(InvalidCredentialsException.class)
    public String handleInvalidCredentialsException(InvalidCredentialsException ex) {
        return ex.getMessage();
    }
    @ExceptionHandler(UserAlreadyExistsException.class)
    public String handleUserAlreadyExistsException(UserAlreadyExistsException ex) {
        return ex.getMessage();
    }
    @ExceptionHandler(ReservationOverlapException.class)
    public String handleReservationOverlapException(ReservationOverlapException ex) {
        return ex.getMessage();
    }
    @ExceptionHandler(LaboratoryNotFoundException.class)
    public String handleLaboratoryNotFoundException(LaboratoryNotFoundException ex) {
        return ex.getMessage();
    }
    @ExceptionHandler(SlotUnavailableException.class)
    public String handleSlotUnavailableException(SlotUnavailableException ex) {
        return ex.getMessage();
    }

}
