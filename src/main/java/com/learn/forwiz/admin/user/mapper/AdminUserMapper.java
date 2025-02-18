package com.learn.forwiz.admin.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminUserMapper {
	List<Map<String, Object>> selectUserList();
}
