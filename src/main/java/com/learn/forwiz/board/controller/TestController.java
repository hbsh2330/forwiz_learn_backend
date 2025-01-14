package com.learn.forwiz.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.forwiz.board.service.TestService;
import com.learn.forwiz.board.vo.TestVO;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/hello")
	String hello() {
		return "Hello, Spring Boot & Vue.js!"; 
	}
	
	@GetMapping("/selectTest.do")
	List<TestVO> selectTest() {
		return testService.selectTest();
	}
}
