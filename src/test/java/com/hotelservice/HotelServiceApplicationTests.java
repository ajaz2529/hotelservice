package com.hotelservice;

import com.hotelservice.entity.Hotel;
import com.hotelservice.exception.ResourceNotFoundException;
import com.hotelservice.repository.HotelRepository;
import com.hotelservice.service.HotelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class HotelServiceApplicationTests {
	@Autowired
	private HotelRepository hotelRepository;
	@Autowired
	private HotelService hotelService;

	@Test
	void contextLoads() {
	}
	@Test
	void print(){
		System.out.println("test");
	}

	@Test
	public void getHotel() {
		try{
			Optional<Hotel> hotel1 = hotelRepository.findById("hotel1");
			Hotel hotel = hotel1.get();
			System.out.println(hotel);
		}catch (Exception e){
			e.printStackTrace();

		}
	}

}
