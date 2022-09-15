package com.example.personapi.exceptions;

import com.example.personapi.response.UniversalResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {
    @ExceptionHandler(ItemAlreadyExistsException.class)
    public ResponseEntity<UniversalResponse>handleItemAlreadyExists(ItemAlreadyExistsException e){
        return ResponseEntity.badRequest()
                .body(UniversalResponse.builder().status(400).message(e.getMessage()).build());
    }
    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<UniversalResponse>handleItemDoesNotExist(ItemNotFoundException e){
        return  ResponseEntity.badRequest().body(UniversalResponse.builder().status(400).message(e.getMessage()).build());
    }


}
