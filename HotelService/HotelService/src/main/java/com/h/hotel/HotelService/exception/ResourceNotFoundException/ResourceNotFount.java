package com.h.hotel.HotelService.exception.ResourceNotFoundException;

public class ResourceNotFount extends RuntimeException {
    public ResourceNotFount(String s) {
        super(s);
    }
   public ResourceNotFount()
    {
     super("Resource not Found !!");
    }
}
