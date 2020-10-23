package com.blackoperations.treadstone.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

//into Entity
@Embeddable
@NoArgsConstructor
@Data
public class BirthdayDto {

    private Integer yearOfBirthday;

    private Integer monthOfBirthday;

    private Integer dayOfBirthday;

    private BirthdayDto(LocalDate birthday) {
        this.yearOfBirthday = birthday.getYear();
        this.monthOfBirthday = birthday.getMonthValue();
        this.dayOfBirthday = birthday.getDayOfMonth();
    }

    public static BirthdayDto of(LocalDate birthday) {
        return new BirthdayDto(birthday);
    }
}
