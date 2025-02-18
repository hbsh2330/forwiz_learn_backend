package com.learn.forwiz.admin.user.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.forwiz.admin.user.mapper.AdminUserMapper;
import com.learn.forwiz.admin.user.service.AdminUserService;

@Service
public class AdminUserServiceImpl implements AdminUserService {

	@Autowired
	AdminUserMapper userMapper;

	@Override
	public List<Map<String, Object>> selectUserList() {
		return userMapper.selectUserList();
	}

}
