package com.example.relational.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(schema = "moo_groups")
public class Groups implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Long category_id;
    private String name;
    private Long user_id;
    private String description;
    private Long type;
    private String photo;
    private Long group_user_count;
    private Timestamp created;
    private Long photo_count;
    private Long topic_count;
    private Long video_count;
    private Long event_count;
    private Long featured;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getGroup_user_count() {
        return group_user_count;
    }

    public void setGroup_user_count(Long group_user_count) {
        this.group_user_count = group_user_count;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Long getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(Long photo_count) {
        this.photo_count = photo_count;
    }

    public Long getTopic_count() {
        return topic_count;
    }

    public void setTopic_count(Long topic_count) {
        this.topic_count = topic_count;
    }

    public Long getVideo_count() {
        return video_count;
    }

    public void setVideo_count(Long video_count) {
        this.video_count = video_count;
    }

    public Long getEvent_count() {
        return event_count;
    }

    public void setEvent_count(Long event_count) {
        this.event_count = event_count;
    }

    public Long getFeatured() {
        return featured;
    }

    public void setFeatured(Long featured) {
        this.featured = featured;
    }
}
