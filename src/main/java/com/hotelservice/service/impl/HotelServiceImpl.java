package com.hotelservice.service.impl;

import com.hotelservice.entity.Hotel;
import com.hotelservice.exception.ResourceNotFoundException;
import com.hotelservice.repository.HotelRepository;
import com.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel addHotel(Hotel hotel) {
        try{
            return hotelRepository.save(hotel);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Hotel getHotel(String hotelId) {
        try{
            return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Hotel> findAllHotels() {
        try{return hotelRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
