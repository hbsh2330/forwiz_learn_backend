package com.learn.forwiz.lecture.vo;

import lombok.Data;

@Data
public class LectureVO {
	String lectureNo;
	String lectureNm;
	String categoryCd;
	String price;
	String detailInfo;
	String thumbnailImage;
	String difficulty;
	String totalCnt;
	String totalTime;
	String openYn;
	String deleteYn;
	String createdDt;
	String createdUser;
	String updatedDt;
	String updatedUser;
	
	String totalRecordCnt;
	
	// 검색 파라미터
	String[] difficultyArray;
	int minPrice;
	int maxPrice;
}
