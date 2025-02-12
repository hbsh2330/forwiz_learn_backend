package com.learn.forwiz.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.learn.forwiz.user.vo.UserVO;

@Mapper
public interface UserMapper {
	String createUser(UserVO param);
}
