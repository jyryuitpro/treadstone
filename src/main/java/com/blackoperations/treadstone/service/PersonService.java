package com.blackoperations.treadstone.service;

import com.blackoperations.treadstone.controller.dto.PersonDto;
import com.blackoperations.treadstone.domain.Person;
import com.blackoperations.treadstone.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPeopleByName(String name) {
        return personRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public Person getPerson(Long id) {
        Person person = personRepository.findById(id).orElse(null);

        log.info("person : {}", person);

        return person;
    }

    @Transactional
    public void put(Person person) {
        personRepository.save(person);
    }

    @Transactional
    public void modify(Long id, PersonDto personDto) {
        Person person = personRepository.findById(id).orElseThrow(() -> new RuntimeException("아이디가 존재하지 않습니다."));

        if (!person.getName().equals(personDto.getName()))
            throw new RuntimeException("이름이 다릅니다.");

        person.set(personDto);

        personRepository.save(person);
    }

    @Transactional
    public void modify(Long id, String name) {
        Person person = personRepository.findById(id).orElseThrow(() -> new RuntimeException("아이디가 존재하지 않습니다."));

        person.setName(name);

        personRepository.save(person);
    }

    @Transactional
    public void delete(Long id) {
        Person person = personRepository.findById(id).orElseThrow(() -> new RuntimeException("아이디가 존재하지 않습니다."));

        person.setDeleted(true);

        personRepository.save(person);

//        personRepository.deleteById(id);
    }
}
