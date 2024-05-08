package com.h.hotel.HotelService.service.impl;

import com.h.hotel.HotelService.entity.Hotel;
import com.h.hotel.HotelService.exception.ResourceNotFoundException.ResourceNotFount;
import com.h.hotel.HotelService.repository.HotelRepository;
import com.h.hotel.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceImpl implements HotelService {
   @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String id= UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFount("Hotel not Found For the Given Id :"+id));
    }
}
