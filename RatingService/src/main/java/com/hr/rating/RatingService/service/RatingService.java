package com.hr.rating.RatingService.service;

import com.hr.rating.RatingService.entity.Rating;

import java.util.List;

public interface RatingService {
    public Rating Create(Rating rating);

    public List<Rating> getRatings();

    public List<Rating> getRatingsByUserId(String id);

    public List<Rating> getRatingsByHotelId(String id);
}
