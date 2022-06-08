package com.example.maerskcontainerbooking.dto.external;

public class ExternalValidateBookingResDto {
    private Integer available;

    public ExternalValidateBookingResDto(Integer i ){
        this.available = i;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getAvailable() {
        return available;
    }
}
