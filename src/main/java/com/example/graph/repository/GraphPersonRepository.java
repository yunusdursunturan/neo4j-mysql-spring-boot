package com.example.graph.repository;

import com.example.graph.domain.Person;

import org.springframework.data.neo4j.repository.GraphRepository;

public interface GraphPersonRepository extends GraphRepository<Person> {
}
