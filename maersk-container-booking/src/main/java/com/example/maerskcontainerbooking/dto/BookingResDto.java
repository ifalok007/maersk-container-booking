package com.example.maerskcontainerbooking.dto;

import com.example.maerskcontainerbooking.domain.ContainerType;

import java.time.LocalDateTime;
import java.util.UUID;

public class BookingResDto {
    UUID bookinRef;

    public BookingResDto() {
    }

    public BookingResDto(UUID bookinRef) {
        this.bookinRef = bookinRef;
    }
}

