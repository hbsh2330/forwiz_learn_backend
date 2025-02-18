package com.learn.forwiz.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.forwiz.lecture.service.LectureService;
import com.learn.forwiz.lecture.vo.LectureVO;
import com.learn.forwiz.user.service.UserService;
import com.learn.forwiz.user.vo.UserVO;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	LectureService lectureService;
	
	@PostMapping("/createUser.do")
	ResponseEntity<String> createUser(@RequestBody UserVO userdata) {
		UserVO param = new UserVO();
		
		param.setPassword(userdata.getPassword());
		param.setUserNm(userdata.getUserNm());
		param.setEmail(userdata.getEmail());
		param.setContact(userdata.getContact());		
		
		String savedUser = userService.createUser(param);
	    return ResponseEntity.ok(savedUser);
	}
	
	@PostMapping("/selectMyOrder.do")
	List<LectureVO> selectMyOrder(@RequestBody LectureVO lectureVO) {
		return lectureService.selectLectureList(lectureVO);
	}
}
