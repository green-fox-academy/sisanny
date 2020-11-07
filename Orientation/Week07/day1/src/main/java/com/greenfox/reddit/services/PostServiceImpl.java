package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PagingPerository;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    final
    PagingPerository pagingPerository;

    final
    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository, PagingPerository pagingPerository) {
        this.postRepository = postRepository;
        this.pagingPerository = pagingPerository;
    }

    @Override
    public List<Post> listAll() {
        return postRepository.findAll();
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post findById(long id) {
        return postRepository.findById(id);
    }

    @Override
    public void upvotePost(Post post) {
        post.setScore(post.getScore() + 1);
        postRepository.save(post);
    }

    @Override
    public void downvotePost(Post post) {
        post.setScore(post.getScore() - 1);
        postRepository.save(post);
    }

    @Override
    public List<Post> getOrderByScore() {
        return postRepository.findAllByOrderByScoreDesc();
    }

    @Override
    public List<Post> getOrderByScorePagination(int pageNo, int pageSize, String sortBy) {

        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).descending());

        Page<Post> pagedResult = pagingPerository.findAll(paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Post>();
        }
    }

    @Override
    public void deletePost(long id) {
        postRepository.deleteById(id);
    }

    @Override
    public List<Post> getOrderByCreationDateDesc() {
        return postRepository.findAllByOrderByCreationDateDesc();
    }

    @Override
    public List<Post> getByKeyWord(String keyword) {
        return postRepository.findAllByTitleContains(keyword);
    }

}