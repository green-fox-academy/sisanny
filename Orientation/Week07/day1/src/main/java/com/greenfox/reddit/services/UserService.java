package com.greenfox.reddit.services;

import com.greenfox.reddit.models.User;

public interface UserService {
    void saveNewUser(User user);

    String login(String inputUserName, String inputPassword);

    boolean isExistUser(String inputUserName);

    User findById(long id);
}

