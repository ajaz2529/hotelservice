package com.hotelservice.service;

import com.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel addHotel(Hotel hotel);
    Hotel getHotel(String hotelId);
    List<Hotel> findAllHotels();
}