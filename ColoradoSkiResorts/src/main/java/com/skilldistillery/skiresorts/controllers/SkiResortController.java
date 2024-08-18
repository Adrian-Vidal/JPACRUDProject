package com.skilldistillery.skiresorts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.skiresorts.dao.SkiResortDAO;
import com.skilldistillery.skiresorts.entities.SkiResort;


@Controller
public class SkiResortController {
	
	@Autowired
	private SkiResortDAO resortDAO;
	
	@RequestMapping(path = {"/", "home.do"})
	public String home(Model model) {
		List<SkiResort> allResorts = resortDAO.findAll();
		model.addAttribute("skiresorts", allResorts);
		return "home";
	}

}
