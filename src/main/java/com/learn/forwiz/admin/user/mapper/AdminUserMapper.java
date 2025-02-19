package com.learn.forwiz.admin.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.learn.forwiz.admin.user.vo.AdminUserVO;


@Mapper
public interface AdminUserMapper {
	List<AdminUserVO> selectUserList(AdminUserVO vo);

	void updateUserRole(Map<String, Object> paramMap);

	List<AdminUserVO> selectUserDetail(Long userNo);
}
