package com.userService.userService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private String ratingId;
    private String hotelId;
    private String userId;
    private String feedback;
    private int rating;
    private Hotel hotel;
}
