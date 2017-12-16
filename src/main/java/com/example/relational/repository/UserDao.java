package com.example.relational.repository;


import com.example.relational.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface UserDao extends JpaRepository<User, Integer> {
    @Query("select u from User u where id in(?1)")
    List<User> userList(List<Integer> idList);
}