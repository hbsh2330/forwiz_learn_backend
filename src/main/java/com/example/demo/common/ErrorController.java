package com.example.demo.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
	
	@GetMapping("/error")
	public String redirectRoot() {
		return "index.html";
	}
	
	public String getErrorPath() {
		return "/error";
	}
}
