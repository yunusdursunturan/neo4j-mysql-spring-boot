package com.example.relational.repository;


import com.example.relational.domain.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface GroupDao extends JpaRepository<Groups,Integer> {
    @Query("select g from Groups g where id in(?1)")
    List<Groups> findAllGroupsId(List<Integer> ids);
}
