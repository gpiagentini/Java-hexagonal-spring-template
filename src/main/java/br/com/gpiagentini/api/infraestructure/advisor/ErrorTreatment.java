package br.com.gpiagentini.api.infraestructure.advisor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorTreatment {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> error404Treatment() {
        return ResponseEntity.internalServerError().body("Internal Server Error. Please Advice");
    }

}
