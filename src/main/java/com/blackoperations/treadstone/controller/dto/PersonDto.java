package com.blackoperations.treadstone.controller.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonDto {

    private String name;

    private String hobby;

    private String address;

    private LocalDate birthdayDto;

    private String job;

    private String phoneNumber;
}
