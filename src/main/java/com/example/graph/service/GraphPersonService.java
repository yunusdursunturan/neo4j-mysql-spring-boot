package com.example.graph.service;

import com.example.graph.domain.Person;

public interface GraphPersonService {

  Person create(Person graphPerson);

  Person findOne(Long id);
}
