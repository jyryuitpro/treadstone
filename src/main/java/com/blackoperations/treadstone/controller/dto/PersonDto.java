package com.blackoperations.treadstone.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class PersonDto {

    private String name;

    private String hobby;

    private String address;

    private LocalDate birthdayDto;

    private String job;

    private String phoneNumber;
}
