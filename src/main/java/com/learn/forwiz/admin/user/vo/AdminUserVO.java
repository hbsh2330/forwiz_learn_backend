package com.learn.forwiz.admin.user.vo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class AdminUserVO {
	private int roleNo;		           //회원역할 번호
	private int lecturePurchaseAmount; //강의 구매 수량
	private int totalPrice;			   //강의 전체 구매금액
	private String userNm;			   //회원명
	private String email;			   //이메일
	private String contact;			   //연락처
	private String registDt;		   //생성일시
	private String roleName;	       //회원유형
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate orderDt;
	private String lectureNo;	       //회원유형
	private int orderPrice;
    private String orderLectureNm;
    private int finishCnt;
    private String reviewContent;
    private int starRate;
	private int starRateCount;
	private double avgStarRate;
	private int reviewContentCount;
	private int lectureCount;
	
	//parameter
    private int userNo;	//회원번호
	private String searchCriteria; //검색조건
	private String searchTerm; //검색어
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate; //시작일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate; //종료일
}
