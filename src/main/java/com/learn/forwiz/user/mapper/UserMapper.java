package com.learn.forwiz.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.learn.forwiz.lecture.vo.LectureVO;
import com.learn.forwiz.user.vo.UserVO;

@Mapper
public interface UserMapper {
	List<UserVO> selectUserList();
}
