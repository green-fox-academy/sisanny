package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByUsername(String inputUserName);

    User findByUsername(String inputUserName);

    User findById(long id);
}
