package com.example.demo.Controller2;

import com.example.demo.Model2.Post;
import com.example.demo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public String getUserPosts(Model model){
        ArrayList<Post> posts = postService.getOnePost();
        model.addAttribute("posts", posts);
        return "posts";
    }

}
