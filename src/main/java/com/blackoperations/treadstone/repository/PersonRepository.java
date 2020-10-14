package com.blackoperations.treadstone.repository;

import com.blackoperations.treadstone.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByName(String name);

    List<Person> findByBlockIsNull();

    List<Person> findByBloodType(String bloodType);

//    @Query(value = "select person from Person person where person.birthdayDto.monthOfBirthday = ?1")
//    List<Person> findByMonthOfBirthday(int monthOfBirthday);

//    @Query(value = "select person from Person person where person.birthdayDto.monthOfBirthday = ?1 and person.birthdayDto.dayOfBirthday = ?2")
//    List<Person> findByMonthOfBirthday(int monthOfBirthday, int dayOfBirthday);

//    @Query(value = "select person from Person person where person.birthdayDto.monthOfBirthday = :monthOfBirthday and person.birthdayDto.dayOfBirthday = :dayOfBirthday")
//    @Query(value = "select * from person where month_of_birthday = :monthOfBirthday and day_of_birthday = :dayOfBirthday", nativeQuery = true)
//    List<Person> findByMonthOfBirthday(@Param("monthOfBirthday") int monthOfBirthday, @Param("dayOfBirthday") int dayOfBirthday);

    @Query(value = "select person from Person person where person.birthdayDto.monthOfBirthday = :monthOfBirthday")
    List<Person> findByMonthOfBirthday(@Param("monthOfBirthday") int monthOfBirthday);
}
