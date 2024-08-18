package com.springbooot.springboot.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/views")
public class ViewController{


	//@ResponseBody
	@GetMapping("/home")
	public String home(){
	
		return "home";
	}
	
	@GetMapping("/thymtest")
	public String thymeleaf(){
	
		return "thymeleafTest";
	}
	
	@ResponseBody
	@GetMapping("/name")
	public String getName(){
	
		return "hellooooooooooooo Arbaz Khan";
	}
	
	
}
