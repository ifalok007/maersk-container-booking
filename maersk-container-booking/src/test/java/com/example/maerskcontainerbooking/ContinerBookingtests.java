package com.example.maerskcontainerbooking;

import com.example.maerskcontainerbooking.domain.ContainerType;
import com.example.maerskcontainerbooking.dto.ValidateBookingReqDto;
import com.example.maerskcontainerbooking.dto.ValidateBookingResDto;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class ContinerBookingtests {


    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        ValidateBookingReqDto req = new ValidateBookingReqDto(20, ContainerType.DRY, "String origin"," String destination", 3);

        /*ResponseEntity<ValidateBookingResDto> res = this.restTemplate.postForEntity("http://localhost:8080/api/booking/checkAvailability",
                req, ValidateBookingResDto.class);
        assertThat(res.getStatusCode(), );*/
    }
}