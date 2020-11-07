package com.greenfox.reddit.services;

import com.greenfox.reddit.models.User;
import com.greenfox.reddit.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    final
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveNewUser(User user) {
        userRepository.save(user);
    }

    @Override
    public String login(String inputUserName, String inputPassword) {
        if (inputPassword != null) {
            if (userRepository.existsByUsername(inputUserName)) {
                User user = userRepository.findByUsername(inputUserName);
                if (user.getPassword().equals(inputPassword)) {
                    return "redirect:/?user=" + user.getId();
                }
            } else {
                return "redirect:/login?warn=true";
            }
        } else {
            return "redirect:/login?warn=true";
        }
        return null;
    }

    @Override
    public boolean isExistUser(String inputUserName) {
        return false;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }
}

