package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class WebController {

    @GetMapping("/test")
    public String test() {

        return "test";
    }
    
    @GetMapping("/lifegame")
    public String viewField() {

        return "viewField";
    }
    

}