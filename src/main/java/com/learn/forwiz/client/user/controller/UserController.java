package com.learn.forwiz.client.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.forwiz.client.user.service.UserService;
import com.learn.forwiz.client.user.vo.UserVO;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	ResponseEntity<String> createUser(@RequestBody UserVO userdata) {
		UserVO param = new UserVO();
		
		param.setPassword(userdata.getPassword());
		param.setUserNm(userdata.getUserNm());
		param.setEmail(userdata.getEmail());
		param.setContact(userdata.getContact());		
		
		String savedUser = userService.createUser(param);
	    return ResponseEntity.ok(savedUser);
	}
}
