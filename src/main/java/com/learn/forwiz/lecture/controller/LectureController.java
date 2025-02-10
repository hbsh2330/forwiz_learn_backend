package com.learn.forwiz.lecture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.forwiz.lecture.service.LectureService;
import com.learn.forwiz.lecture.vo.LectureVO;

@RestController
@RequestMapping("/api/lecture")
public class LectureController {
	
	@Autowired
	LectureService lectureService;
	
	@GetMapping("/selectLectureList.do")
	List<LectureVO> selectLectureList() {
		return lectureService.selectLectureList();
	}
	
	@GetMapping("/selectLectureDetail.do")
	LectureVO selectLectureDetail(String lectureNo) {
		return lectureService.selectLectureDetail(lectureNo);
	}
}
