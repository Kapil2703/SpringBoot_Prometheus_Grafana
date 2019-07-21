package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//https://dzone.com/articles/monitoring-using-spring-boot-20-prometheus-and-gra
	
@Controller
public class WelcomeController {

	@GetMapping("/index")
    public String welcome() {
        return "index"; 
    }	
	
	@GetMapping("/user")
    public String getName() {
        return "Kapiil";
    }	
}
