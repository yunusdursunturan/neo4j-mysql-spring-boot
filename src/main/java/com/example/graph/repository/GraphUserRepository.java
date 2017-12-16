package com.example.graph.repository;

import com.example.graph.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface GraphUserRepository extends GraphRepository<User> {


    @Query("MATCH (u:User)-[r:FRIEND]->(fr:User) WHERE u.mysqlId={mysqlId} RETURN u,r,fr")
    List<User> graph(@Param("mysqlId") Long mysqlId);
}
