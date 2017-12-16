package com.example.graph.service.impl;

import com.example.graph.domain.Person;
import com.example.graph.repository.GraphPersonRepository;

import com.example.graph.service.GraphPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraphPersonServiceImpl implements GraphPersonService {

  @Autowired
  private GraphPersonRepository graphPersonRepository;

  @Override
  public Person create(Person graphPerson) {
    return graphPersonRepository.save(graphPerson);
  }

  @Override
  public Person findOne(Long id) {
    return graphPersonRepository.findOne(id);
  }
}
