package com.hr.rating.RatingService.ratingcontroller;

import com.hr.rating.RatingService.entity.Rating;
import com.hr.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    @PostMapping("/save")
    public ResponseEntity<Rating> create(@RequestBody Rating ratings)
    {
        Rating obj= ratingService.Create(ratings);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId)
    {

        return ResponseEntity.ok(ratingService.getRatingsByUserId(userId));
    }
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity< List<Rating>> getRatingsByhotelId(@PathVariable String hotelId)
    {

        return ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
    }
    @GetMapping("/api")
   public  String Test()
   {
       return "API";
   }

}
