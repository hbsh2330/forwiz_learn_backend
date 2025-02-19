package com.learn.forwiz.client.lecture.vo;

import lombok.Data;

@Data
public class LectureVO {
	String lectureNo;			/* 강의번호     */
	String lectureNm;			/* 강의명       */
	String categoryCd;			/* 카테고리코드 */
	String price;				/* 가격         */
	String detailInfo;			/* 상세정보     */
	String thumbnailImage;		/* 썸네일이미지 */
	String difficulty;			/* 난이도       */
	String totalCnt;			/* 총강의수     */
	String totalTime;			/* 총강의시간   */
	String openYn;				/* 공개여부     */
	String deleteYn;			/* 삭제여부     */
	String createdDt;			/* 등록일시     */
	String createdUser;			/* 등록자       */
	String updatedDt;			/* 수정일시     */
	String updatedUser;			/* 수정자       */
	
	// 페이징
	int totalRecordCnt;			/* 총결과개수   */
	int page;					/* 현재페이지   */
	int pageCnt;				/* 페이징개수   */
	int recordCnt;				/* 레코드개수   */
	
	// 검색 파라미터
	String[] difficultyArray;	/* 난이도배열   */
	int minPrice;				/* 최대가격     */
	int maxPrice;				/* 최소가격     */
	String orderBy;				/* 정렬         */
}
