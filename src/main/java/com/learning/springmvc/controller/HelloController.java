package com.learning.springmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HelloController {

	@PostMapping(value = "/hello", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String hello(@RequestBody Foo foo, Model model) {

		model.addAttribute("name", foo.name);

		return "welcome";
	}
}
