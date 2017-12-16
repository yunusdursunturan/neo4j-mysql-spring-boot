package com.example.relational.repository;


import com.example.relational.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CompanyDao extends JpaRepository<Company, Long> {
    @Query("select c from Company c where id in(?1)")
    List<Company> userList(List<Integer> idList);
}
