package com.learn.forwiz.lecture.service;

import java.util.List;

import com.learn.forwiz.lecture.vo.LectureVO;

public interface LectureService {
	List<LectureVO> selectLectureList();
	LectureVO selectLectureDetail(String lectureNo);
}
