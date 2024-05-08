package com.h.hotel.HotelService.controller;

import com.h.hotel.HotelService.entity.Hotel;
import com.h.hotel.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class Controller {
    @Autowired
    private HotelService hotelService;
    @PostMapping("/save")
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel)
    {
       Hotel hotel1=hotelService.create(hotel);
       return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }
    @GetMapping("/all")
    public ResponseEntity< List<Hotel>>getAll()
    {
       List<Hotel>  hotel=hotelService.getAll();
        return ResponseEntity.ok(hotel);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getById(@PathVariable String id)
    {
        Hotel hotel=hotelService.get(id);
        return ResponseEntity.ok(hotel);
    }
    public  String test()
    {
        return "API";
    }
}
