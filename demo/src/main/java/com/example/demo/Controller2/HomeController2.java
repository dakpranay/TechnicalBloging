package com.example.demo.Controller2;

import com.example.demo.Model2.Post;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;


@Controller
public class HomeController2 {
    @RequestMapping("/")
    public String getAllPost(Model model) {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Body 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts", posts);
        return "index";
    }
}
