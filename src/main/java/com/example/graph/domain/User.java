package com.example.graph.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NodeEntity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class User implements Serializable {

    private static final long serialVersionUID = 3052327829901249416L;

    @GraphId
    private Long id;
    private String name;
    private String country;
    private Long mysqlId;

    @Relationship(type = "FRIEND", direction = Relationship.INCOMING)
    private List<RelationStatus> relationStatus = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getMysqlId() {
        return mysqlId;
    }

    public void setMysqlId(Long mysqlId) {
        this.mysqlId = mysqlId;
    }

    public List<RelationStatus> getRelationStatus() {
        return relationStatus;
    }

    public void setRelationStatus(List<RelationStatus> relationStatuses) {
        this.relationStatus = relationStatuses;
    }

    public void addRelationStatus(RelationStatus relationStatus) {
        this.relationStatus.add(relationStatus);
    }
}
