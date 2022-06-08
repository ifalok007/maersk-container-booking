package com.example.maerskcontainerbooking.dto;

import com.example.maerskcontainerbooking.domain.ContainerType;


public class ValidateBookingReqDto {
//    containerSize
//    Integer – either 20 or 40
//    containerType
//    Enum – DRY, REEFER
//            origin
//    String – min 5, max 20
//    destination
//    String – min 5, max 20
//    quantity
//    Integer – min 1, max 100

    private Integer containerSize;
    private ContainerType containerType;
    private String origin;
    private String destination;
    private Integer quantity;

    public ValidateBookingReqDto() {
    }

    public ValidateBookingReqDto(Integer containerSize, ContainerType containerType, String origin, String destination, Integer quantity) {
        this.containerSize = containerSize;
        this.containerType = containerType;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
    }

    public Integer getContainerSize() {
        return containerSize;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
    }

    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
