package com.skilldistillery.skiresorts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.skiresorts.dao.SkiResortDAO;

import ch.qos.logback.core.model.Model;

@Controller
public class SkiResortController {
	
	@Autowired
	private SkiResortDAO resortDAO;
	
	@RequestMapping(path = {"/", "home.do"})
	public String home(Model model) {
		return "home";
	}

}
