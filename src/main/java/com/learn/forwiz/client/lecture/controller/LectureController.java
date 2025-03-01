package com.learn.forwiz.client.lecture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.forwiz.client.lecture.service.LectureService;
import com.learn.forwiz.client.lecture.vo.LectureVO;

@RestController
@RequestMapping("/api/lecture")
public class LectureController {
	
	@Autowired
	LectureService lectureService;
	
	@PostMapping("/selectLectureList.do")
	List<LectureVO> selectLectureList(@RequestBody LectureVO lectureVO) {
		return lectureService.selectLectureList(lectureVO);
	}
	
	@GetMapping("/selectLectureDetail.do")
	LectureVO selectLectureDetail(String lectureNo) {
		return lectureService.selectLectureDetail(lectureNo);
	}
}
