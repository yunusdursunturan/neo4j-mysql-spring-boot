package com.example.graph.service.impl;

import com.example.graph.domain.User;
import com.example.graph.repository.GraphUserRepository;
import com.example.graph.service.GraphUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class GraphUserServiceImpl implements GraphUserService {

  @Autowired
  private GraphUserRepository userRepository;

  @Override
  public User create(User user) {
    return userRepository.save(user);
  }

  @Override
  public User findOne(Long id) {
    return userRepository.findOne(id);
  }

  @Override
  public Collection<User> getAll() {

    return (Collection<User>) userRepository.findAll();
  }

    @Override
    public List<User> getUserByMysqlId(Long mysqlId) {
        return userRepository.graph(mysqlId);
    }
}
