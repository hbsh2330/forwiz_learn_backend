package com.learn.forwiz.admin.user.service;

import java.util.List;
import java.util.Map;

import com.learn.forwiz.admin.user.vo.AdminUserVO;


public interface AdminUserService {
	
	List<AdminUserVO> selectUserList(AdminUserVO vo);

	void updateUserRole(Map<String, Object> paramMap);

	List<AdminUserVO> selectUserDetail(Long userNo);
}
