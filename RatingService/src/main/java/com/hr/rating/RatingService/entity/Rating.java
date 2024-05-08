package com.hr.rating.RatingService.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Rating {
    @Id
    private  String ratingId;
    private  String userId;
    private  String hotelId;
    private  String feedback;
    private  int rating;
}
