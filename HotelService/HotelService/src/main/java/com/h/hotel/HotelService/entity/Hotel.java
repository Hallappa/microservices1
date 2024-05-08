package com.h.hotel.HotelService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Hotel {
    @Id
    private String id;
    private String name;
    private String about;
    private String location;
}
