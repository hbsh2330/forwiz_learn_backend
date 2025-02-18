package com.learn.forwiz.client.user.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.forwiz.client.user.mapper.UserMapper;
import com.learn.forwiz.client.user.service.UserService;
import com.learn.forwiz.client.user.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public String createUser(UserVO param) {
		return userMapper.createUser(param);
	}
}
