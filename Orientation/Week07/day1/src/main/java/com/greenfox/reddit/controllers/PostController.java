
package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.models.User;
import com.greenfox.reddit.services.PostService;
import com.greenfox.reddit.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    final
    UserService userService;

    final
    PostService postService;

    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping(path = {"/", "/{pageNumber}"})
    public String postListRender(Model model, @PathVariable(required = false) Integer pageNumber, @RequestParam Long user) {
        if (pageNumber == null) {
            pageNumber = 0;
        }
        model.addAttribute("posts", postService.getOrderByScorePagination(pageNumber, 10, "score"));
        model.addAttribute("header", "Trending Posts");
        model.addAttribute("pageNumber", pageNumber);
        model.addAttribute("userId", user);
        return "postlist";
    }

    @GetMapping(path = "/submit")
    public String newPostRender(Model model, @RequestParam long userId) {
        model.addAttribute("post", new Post());
        model.addAttribute("userId", userId);
        return "submitpost";
    }

    @PostMapping(path = "/submit/{userId}")
    public String addNewPost(@ModelAttribute Post post, @PathVariable long userId) {
        User user = userService.findById(userId);
        post.setUser(user);
        postService.savePost(post);
        List<Post> postList = user.getListOfPosts();
        postList.add(post);
        userService.saveNewUser(user);
        return "redirect:/?user=" + userId;
    }

    @PostMapping(path = "/upvote/{id}/{userId}")
    public String upvote(@PathVariable long id, @PathVariable long userId) {
        Post post = postService.findById(id);
        User user = userService.findById(userId);
        postService.upvotePost(post);
        return "redirect:/?user=" + userId;
    }

    @PostMapping(path = "/downvote/{id}/{userId}")
    public String downvote(@PathVariable long id, @PathVariable long userId) {
        Post post = postService.findById(id);
        postService.downvotePost(post);
        return "redirect:/?user=" + userId;
    }

    @GetMapping(path = "/register")
    public String registerRender(Model model) {
        model.addAttribute("register", new User());
        return "register";
    }

    @PostMapping(path = "/register")
    public String newUser(@ModelAttribute User user) {
        userService.saveNewUser(user);
        return "login";
    }

    @PostMapping(path = "/delete/{id}")
    public String deletePost(@PathVariable long id) {
        postService.deletePost(id);
        return "redirect:/";
    }

    @GetMapping(path = "/allposts")
    public String allPosts(Model model) {
        model.addAttribute("posts", postService.getOrderByCreationDateDesc());
        model.addAttribute("header", "Latest Posts");
        return "postlist";
    }

    @GetMapping(path = "/search")
    public String searchPost(@RequestParam("searchbar") String keyword, Model model) {
        model.addAttribute("posts", postService.getByKeyWord(keyword));
        return "postlist";
    }

    @GetMapping(path = "/login")
    public String loginRender(@RequestParam(name = "warn", required = false, defaultValue = "false") boolean warn, Model model) {
        model.addAttribute("warn", warn);
        return "login";
    }

    @PostMapping(path = "/login")
    public String login(@RequestParam("username") String inputUserName, @RequestParam("password") String inputPassword) {
        return userService.login(inputUserName, inputPassword);
    }
}