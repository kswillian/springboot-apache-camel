package com.kaminski.orch.categorias.exception.handler;

import com.kaminski.orch.categorias.exception.ResourceNotFound;
import com.kaminski.orch.categorias.model.response.ErrorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorDto> resourceNotFoundException(ResourceNotFound exception){
        var error = new ErrorDto(NOT_FOUND.value(), exception.getMessage());
        return ResponseEntity.status(NOT_FOUND).body(error);
    }
}
