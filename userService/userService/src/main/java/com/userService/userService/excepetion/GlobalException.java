package com.userService.userService.excepetion;

import com.userService.userService.ApiRespones.ApiRespones;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiRespones>handlerResourceNotFoundException(ResourceNotFoundException ex)
    {
      String massage= ex.getMessage();
        ApiRespones respones=ApiRespones.builder().massage(massage).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiRespones>(respones,HttpStatus.NOT_FOUND);
    }

}
