package com.example.maerskcontainerbooking.entity;

import com.example.maerskcontainerbooking.domain.ContainerType;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Bookings {
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
//    timestamp
//    String - ISO-8601 date and time for UTC
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column(name = "SIZE")
    Integer containerSize;
    @Column(name = "TYPE")
    String containerType;
    @Column(name = "ORIGIN")
    String origin;
    @Column(name = "DEST")
    String destination;
    @Column(name = "QUANTITY")
    Integer quantity;
    @Column(name = "TIMESTAMP")
    LocalDateTime timestamp= LocalDateTime.now();

    public Bookings() {
    }

    public Bookings(Integer containerSize, String containerType, String origin, String destination, Integer quantity) {
        this.containerSize = containerSize;
        this.containerType = containerType;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
    }

    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType.name();
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

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Long getId() {
        return Id;
    }

    public Integer getContainerSize() {
        return containerSize;
    }

    public String getContainerType() {
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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
