package com.example.maerskcontainerbooking.dto;

import com.example.maerskcontainerbooking.domain.ContainerType;

import java.time.LocalDateTime;

public class BookingReqDto {

    public Integer containerSize;
    public ContainerType containerType;
    public String origin;
    public  String destination;
    public Integer quantity;
    public LocalDateTime timestamp;

    public BookingReqDto(Integer containerSize, ContainerType containerType, String origin, String destination, Integer quantity, LocalDateTime timestamp) {
        this.containerSize = containerSize;
        this.containerType = containerType;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }
}

