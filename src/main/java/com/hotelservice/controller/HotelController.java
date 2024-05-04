package com.hotelservice.controller;

import com.hotelservice.entity.Hotel;
import com.hotelservice.servive.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping("/addhotel")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        try{
            Hotel saved = hotelService.addHotel(hotel);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);

        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping ("/get-hotel/{hotelId}")
    public ResponseEntity<Hotel> addHotel(@PathVariable String hotelId){
        try{
            Hotel hotel = hotelService.getHotel(hotelId);
            return new ResponseEntity<>(hotel, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping("/all-hotels")
    public ResponseEntity<List<Hotel>> addHotel(){
        try{
            List<Hotel> hotels = hotelService.findAllHotels();
            return new ResponseEntity<>(hotels, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}
