package com.blackoperations.treadstone.repository;

import com.blackoperations.treadstone.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
