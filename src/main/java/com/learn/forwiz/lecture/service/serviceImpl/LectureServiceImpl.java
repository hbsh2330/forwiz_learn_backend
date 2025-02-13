package com.learn.forwiz.lecture.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.forwiz.lecture.mapper.LectureMapper;
import com.learn.forwiz.lecture.service.LectureService;
import com.learn.forwiz.lecture.vo.LectureVO;

@Service
public class LectureServiceImpl implements LectureService {

	@Autowired
	LectureMapper lectureMapper;
	
	@Override
	public List<LectureVO> selectLectureList(LectureVO lectureVO) {
		return lectureMapper.selectLectureList(lectureVO);
	}

	@Override
	public LectureVO selectLectureDetail(String lectureNo) {
		return lectureMapper.selectLectureDetail(lectureNo);
	}

}
