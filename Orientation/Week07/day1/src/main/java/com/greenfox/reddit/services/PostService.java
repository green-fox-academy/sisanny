package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;

import java.util.List;

public interface PostService {
    List<Post> listAll();

    Post savePost(Post post);

    Post findById(long id);

    void upvotePost(Post post);

    void downvotePost(Post post);

    List<Post> getOrderByScore();

    List<Post> getOrderByScorePagination(int pageNo, int pageSize, String sortBy);

    void deletePost(long id);

    List<Post> getOrderByCreationDateDesc();

    List<Post> getByKeyWord(String keyword);


}
