package com.learn.forwiz.admin.user.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.forwiz.admin.user.mapper.AdminUserMapper;
import com.learn.forwiz.admin.user.service.AdminUserService;
import com.learn.forwiz.admin.user.vo.AdminUserVO;

@Service
public class AdminUserServiceImpl implements AdminUserService {

	@Autowired
	AdminUserMapper userMapper;

	@Override
	public List<AdminUserVO> selectUserList(AdminUserVO vo) {
		return userMapper.selectUserList(vo);
	}

	@Override
	public void updateUserRole(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		 userMapper.updateUserRole(paramMap);
	}

	@Override
	public List<AdminUserVO> selectUserDetail(Long userNo) {
		// TODO Auto-generated method stub
		System.out.println("service UserNo :" + userNo);
		return userMapper.selectUserDetail(userNo);
	}

}
