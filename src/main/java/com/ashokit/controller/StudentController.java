package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.domain.Student;

@Controller
public class StudentController {

	@GetMapping(value = { "/", "/register" })
	public String loadForm(Model model) {

		//// Sending form binding object to UI
		Student s = new Student();
		model.addAttribute("student", s);

		// Returning logical view name
		return "studentReg";
	}

	@PostMapping(value = "/register")
	public String handleSubmitBtn(@ModelAttribute("student") Student s, Model model) {
		
		System.out.println(s);

		// sending response to UI
		model.addAttribute("succMsg", "Registration Successful");

		// returning logical view name
		return "studentReg";
	}

}
