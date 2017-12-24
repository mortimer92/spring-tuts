package com.flurin.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flurin.service.demo.GenericWelcomeService;
import com.flurin.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	//http://localhost:8080/spring-mvc-demo-1/
	public String doWelcome(Model model) {
		
		//1. Retrieving the processed data
//		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("FLOORIN DUDU");
		
		//2. Add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		//3. Return logical view name
		return "welcomeNew";  //WEB-INF/views/welcomeNew.jsp
		
	}
	
	

}
