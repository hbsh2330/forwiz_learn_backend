package com.learn.forwiz.user.service;

import java.util.List;

import com.learn.forwiz.lecture.vo.LectureVO;
import com.learn.forwiz.user.vo.UserVO;

public interface UserService {
	List<UserVO> selectUserList();
}
