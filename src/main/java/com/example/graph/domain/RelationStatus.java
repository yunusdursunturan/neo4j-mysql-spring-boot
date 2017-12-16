package com.example.graph.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.neo4j.ogm.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@RelationshipEntity(type = "FRIEND")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class RelationStatus implements Serializable {

    @GraphId
    private Long id;

    private Collection<String> relationStatus = new ArrayList<>();

    @StartNode
    private User user;

    @EndNode
    private User friend;

    public RelationStatus() {
    }

    public RelationStatus(User user, User friend) {
        this.user = user;
        this.friend = friend;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<String> getRelationStatus() {
        return relationStatus;
    }

    public void setRelationStatus(Collection<String> relationStatus) {
        this.relationStatus = relationStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }

    public void addrelationStatus(String name) {
        this.relationStatus.add(name);
    }
}
