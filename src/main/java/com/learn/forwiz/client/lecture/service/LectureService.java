package com.learn.forwiz.client.lecture.service;

import java.util.List;

import com.learn.forwiz.client.lecture.vo.LectureVO;

public interface LectureService {
	List<LectureVO> selectLectureList(LectureVO lectureVO);
	LectureVO selectLectureDetail(String lectureNo);
}
