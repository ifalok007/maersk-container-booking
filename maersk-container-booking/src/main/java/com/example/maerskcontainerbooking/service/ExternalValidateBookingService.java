package com.example.maerskcontainerbooking.service;

import com.example.maerskcontainerbooking.dto.external.ExternalValidateBookingResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalValidateBookingService {
    @Autowired
    RestTemplate restTemplate;

    public ExternalValidateBookingResDto validateBooking(){
        ResponseEntity<ExternalValidateBookingResDto> response
                = restTemplate.getForEntity( "https://maersk.com/api/bookings/checkAvailable", ExternalValidateBookingResDto.class);

        ResponseEntity<ExternalValidateBookingResDto> res = new ResponseEntity<ExternalValidateBookingResDto>(new ExternalValidateBookingResDto(5), HttpStatus.ACCEPTED);
        return res.getBody();
    }
}
