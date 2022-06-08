package com.example.maerskcontainerbooking.controllers;

import com.example.maerskcontainerbooking.dto.BookingReqDto;
import com.example.maerskcontainerbooking.dto.BookingResDto;
import com.example.maerskcontainerbooking.dto.ValidateBookingReqDto;
import com.example.maerskcontainerbooking.dto.ValidateBookingResDto;
import com.example.maerskcontainerbooking.dto.external.ExternalValidateBookingResDto;
import com.example.maerskcontainerbooking.entity.Bookings;
import com.example.maerskcontainerbooking.service.BookingPersistenceService;
import com.example.maerskcontainerbooking.service.ExternalValidateBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
public class BookingController {
    @Autowired
    private ExternalValidateBookingService externalService;

    @Autowired
    BookingPersistenceService persistenceService;

    @PostMapping("/checkAvailability")
    public ResponseEntity<ValidateBookingResDto> checkContainerAvailability(@RequestBody ValidateBookingReqDto validateReq){
        ExternalValidateBookingResDto response = this.externalService.validateBooking();
        ResponseEntity<ValidateBookingResDto> result;
        if(response.getAvailable() > 0){
            result = new ResponseEntity<>(new ValidateBookingResDto(true), HttpStatus.ACCEPTED);
        }else{
            result = new ResponseEntity<>(new ValidateBookingResDto(false), HttpStatus.ACCEPTED);
        }
        return result;
    }


    @PostMapping("/book")
    public ResponseEntity<BookingResDto> bookContainer(@RequestBody BookingReqDto req){
        Bookings booking = new Bookings(req.containerSize, req.containerType.name(), req.origin, req.destination, req.quantity);
        Optional<UUID> res = persistenceService.saveBooking(booking);
        if(res.isPresent()){
            return new ResponseEntity<>(new BookingResDto(res.get()), HttpStatus.ACCEPTED);
        } else{
            return new ResponseEntity<>(new BookingResDto(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
