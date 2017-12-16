package com.example.graph.service;

import com.example.graph.domain.User;

import java.util.Collection;
import java.util.List;

public interface GraphUserService {

  User create(User user);

  User findOne(Long id);

  Collection<User> getAll();

  List<User> getUserByMysqlId(Long mysqlId);
}
