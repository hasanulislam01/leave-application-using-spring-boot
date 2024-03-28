package com.practice.registration.controller;

import ch.qos.logback.core.model.Model;
import com.practice.registration.entity.user;
//import com.practice.registration.service.userService;
import com.practice.registration.service.userService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.practice.registration.repository.userRepository;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


//@RequestMapping("/api")
@Controller
public class userController {
    int numCount = 0;
    private final userService userService;

//    private userService userService;
//
    @Autowired
    private userRepository userRepository;


    @GetMapping("/")
    public String home(){
        return "index";
    }

//    @GetMapping("/countView")
//    public String countView(){
//        return "countView";
//    }

//    @ModelAttribute
    @PostMapping("/register")
    public String register( @ModelAttribute user u, HttpSession httpSession, RedirectAttributes redirectAttributes, ModelMap model){
        System.out.println(u);

        userRepository.save(u);
        redirectAttributes.addFlashAttribute("successMessage", "Insert Successfully!");


        Long count = userService.getCountOfRecords();
        String count1 = Long.toString(count);
//        model.addText(count);
//        model.addAttribute("count",""+numCount);


        int numOfNotification =0;
        numOfNotification++;
        numCount = numOfNotification;
//        if (numOfNotification==0){
//            redirectAttributes.addFlashAttribute("count","");
//
//        }
//        else {
//            redirectAttributes.addFlashAttribute("count",""+numCount);
//        }


//        model.addAttribute("count",""+count);
        redirectAttributes.addFlashAttribute("count",""+count);
        System.out.println("Long "+count);
        System.out.println("String "+count1);


        return "redirect:/";
    }

    @GetMapping("variableView")
    public ModelAndView printVariableValue(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("variableValue", numCount);
        return modelAndView;
    }



    public userController(userService userService) {
        this.userService = userService;
    }

//    @GetMapping("/count")
//    public String getCount(RedirectAttributes redirectAttributes) {
//        Long count = userService.getCountOfRecords();
//        String count1 = Long.toString(count);
////        model.addText(count);
//
//        redirectAttributes.addFlashAttribute("count",""+count);
//        System.out.println("Long "+count);
//        System.out.println("String "+count1);
//        return "redirect:/countView";
////        return "countView"; // Assuming you have a Thymeleaf view named "count.html"
//    }

//    public String getRecords(Model model) {
//        long recordCount = userRepository.count();
//        model.addAttribute("recordCount", recordCount);
//        return "my-template"; // Your template name
//    }





}
