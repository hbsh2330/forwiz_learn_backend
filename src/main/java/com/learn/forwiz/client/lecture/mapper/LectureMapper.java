package com.learn.forwiz.client.lecture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.learn.forwiz.client.lecture.vo.LectureVO;

@Mapper
public interface LectureMapper {
	List<LectureVO> selectLectureList(LectureVO lectureVO);
	LectureVO selectLectureDetail(String lectureNo);
}
