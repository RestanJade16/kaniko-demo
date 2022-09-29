package com.project.service;

import com.project.model.People;
import com.project.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService{

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public String getName() {
        Optional<People> foundPeople = peopleRepository.findById(1L);
        return foundPeople.get().getFirstName()+" "+foundPeople.get().getMiddleName()+" "+foundPeople.get().getLastName() ;
    }
}
