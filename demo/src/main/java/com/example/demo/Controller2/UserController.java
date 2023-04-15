package com.example.demo.Controller2;

import com.example.demo.Model2.Post;
import com.example.demo.Model2.User;
import com.example.demo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    private PostService postService;

    @RequestMapping("/users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping("/users/registration")
    public String registration(){
        return "users/registration";
    }

    @RequestMapping(value = "users/login",method = RequestMethod.POST)
    public String loginUser(User user){
        return "redirect:/posts";
    }

    @RequestMapping(value = "users/logout",method = RequestMethod.POST)
    public String logout(Model model){
        ArrayList<Post> posts= postService.getAllPost();
        model.addAttribute("posts", posts);
        return "index";
    }


}
