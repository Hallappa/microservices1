package com.h.hotel.HotelService.exception.ResourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ResourceNotFount.class)
    public ResponseEntity<Map<String,Object>>Notexceptionhandler(ResourceNotFount ex)
    {
    Map map=new HashMap();
    map.put("massage",ex.getMessage());
    map.put("success",false);
    map.put("status", HttpStatus.NOT_FOUND);
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }

}
