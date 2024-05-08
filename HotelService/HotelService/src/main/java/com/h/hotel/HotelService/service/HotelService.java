package com.h.hotel.HotelService.service;

import com.h.hotel.HotelService.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String id);


}
