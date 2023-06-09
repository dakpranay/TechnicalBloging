package com.example.demo.Controller2;

import com.example.demo.Model2.Post;
import com.example.demo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;


@Controller
public class HomeController2 {
    public HomeController2(){
        System.out.println("Home Controller");
    }

    @Autowired
    private PostService postService;
    @RequestMapping("/")
    public String getAllPost(Model model) {
       ArrayList<Post> posts= postService.getAllPost();
        model.addAttribute("posts", posts);
        return "index";
    }
}
