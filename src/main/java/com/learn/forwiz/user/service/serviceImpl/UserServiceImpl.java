package com.learn.forwiz.user.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.forwiz.lecture.mapper.LectureMapper;
import com.learn.forwiz.lecture.service.LectureService;
import com.learn.forwiz.lecture.vo.LectureVO;
import com.learn.forwiz.user.mapper.UserMapper;
import com.learn.forwiz.user.service.UserService;
import com.learn.forwiz.user.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public List<UserVO> selectUserList() {
		// TODO Auto-generated method stub
		return userMapper.selectUserList();
	}
	

}
