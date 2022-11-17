package com.simplilearn.Phase3_Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.simplilearn.Phase3_Spring.dao.DAO;
import com.simplilearn.Phase3_Spring.model.User;


@Controller
public class SearchUsers {

	@Autowired
	DAO dao;
	
	@PostMapping("/listUsers")
	public String listUser(Model model) {
		List<User> users =  dao.getUsers();
		model.addAttribute("users",users);
		
		return "listUser";		
	}
	
		
}
