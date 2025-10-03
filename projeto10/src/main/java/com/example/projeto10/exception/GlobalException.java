package com.example.projeto10.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(IllegalArgumentException erro) {
        // Corrigido o erro de sintaxe removendo o parêntese extra
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Map.of("mensagem", erro.getMessage()));
    }
}

