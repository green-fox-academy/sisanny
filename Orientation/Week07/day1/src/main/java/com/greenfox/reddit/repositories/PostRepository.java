package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAll();

    Post findById(long id);

    List<Post> findAllByOrderByScoreDesc();

    List<Post> findAllByOrderByCreationDateDesc();

    List<Post> findAllByTitleContains(String keyword);


}
