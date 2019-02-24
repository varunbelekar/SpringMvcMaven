package com.varun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.varun.model.Feedback;
import com.varun.service.FeedBackService;

@Controller
public class HomeController {
	
	@Autowired
	FeedBackService feedBackService;

	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/feedback")
	public ModelAndView feedbackForm() {
		return new ModelAndView("feedback","command",new Feedback());
	}
	
	@RequestMapping("/addFeedback")
	public String addFeedBack() {
		System.out.println("In add feedback");
		return "redirect:/feedback";
	}
}
