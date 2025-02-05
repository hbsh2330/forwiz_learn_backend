package com.learn.forwiz.lecture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.learn.forwiz.lecture.vo.LectureVO;

@Mapper
public interface LectureMapper {
	List<LectureVO> selectLectureList();
	LectureVO selectLectureDetail(String lectureId);
}
