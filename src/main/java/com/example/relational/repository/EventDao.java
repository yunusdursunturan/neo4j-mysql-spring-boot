package com.example.relational.repository;


import com.example.relational.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface EventDao extends JpaRepository<Event, Integer> {
    @Query("select e from Event e where id in(?1)")
    List<Event> findEvent(List<Integer> eventId);
}
