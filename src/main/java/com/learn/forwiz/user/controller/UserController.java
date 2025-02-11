package com.learn.forwiz.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/selectUserList.do")
	List<UserVO> selectUserList() {
		return userService.selectUserList();
	}

}
