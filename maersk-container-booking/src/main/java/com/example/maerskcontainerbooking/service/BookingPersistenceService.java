package com.example.maerskcontainerbooking.service;

import com.example.maerskcontainerbooking.entity.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class BookingPersistenceService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Optional<UUID> saveBooking(Bookings bookings){
        int row = jdbcTemplate.update("INSERT INTO BOOKINGS(TYPE, SIZE, ORIGIN, DEST, QUANTITY) VALUES (?,?,?,?,?)",
                        bookings.getContainerType(),
                        bookings.getContainerSize(),
                        bookings.getOrigin(),
                        bookings.getDestination(),
                        bookings.getQuantity());
        if(row > 0){
            return Optional.of(UUID.randomUUID());
        }else {
            return Optional.empty();
        }
    }
}
