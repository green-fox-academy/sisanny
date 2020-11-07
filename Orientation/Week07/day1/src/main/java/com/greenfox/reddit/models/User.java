package com.greenfox.reddit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    public User() {
    }

    public User(long Id, String unsername, List<Post> listOfPost) {
        this.Id = Id;
        this.listOfPost = listOfPost;
        this.username = unsername;
    }

    @Id
    private long Id;

    @Column
    private String username;

    @Column
    private String password;

    @OneToMany
    private List<Post> listOfPost;

    public long getId() {
        return Id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setListOfPost(List<Post> listOfPost) {
        this.listOfPost = listOfPost;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Post> getListOfPosts() {
        return listOfPost;
    }
}
