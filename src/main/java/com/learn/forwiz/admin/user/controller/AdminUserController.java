package com.learn.forwiz.admin.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.forwiz.admin.user.service.AdminUserService;

@RestController
@RequestMapping("/api/user")
public class AdminUserController {
	
	@Autowired
	AdminUserService userService;
	
	@GetMapping("/selectUserList.do")
	List<Map<String, Object>> selectUserList() {
		
		return userService.selectUserList();
	}
	
}
