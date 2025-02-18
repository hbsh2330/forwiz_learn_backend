package com.learn.forwiz.client.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.learn.forwiz.client.user.vo.UserVO;

@Mapper
public interface UserMapper {
	String createUser(UserVO param);
}
