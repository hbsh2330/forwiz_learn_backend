package com.learn.forwiz.lecture.vo;

import lombok.Data;

@Data
public class LectureVO {
	String lectureId;
	String categoryId;
	String categoryNm;
	String lectureNm;
	String price;
	String discountRate;
	String createdDt;
	String updatedDt;
	String deletedDt;
	String detailInfo;
	String thumbnailImage;
	String difficulty;
	String totalCnt;
	String totalTime;
	String diplomaYn;
	String openYn;
	String deleteYn;
}
