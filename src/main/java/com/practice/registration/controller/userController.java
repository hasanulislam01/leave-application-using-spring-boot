package com.practice.registration.controller;

import com.practice.registration.entity.user;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.practice.registration.repository.userRepository;

@Controller
public class userController {

    @Autowired
    private userRepository userRepository;


    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute user u, HttpSession httpSession){
        System.out.println(u);
        userRepository.save(u);
        httpSession.setAttribute("message","Insert Successfull");

        return "redirect:/";
    }

}
