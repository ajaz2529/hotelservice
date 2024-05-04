package com.hotelservice.servive;

import com.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {
    public Hotel addHotel(Hotel hotel);
    public Hotel getHotel(String hotelId);
    public List<Hotel> findAllHotels();
}
