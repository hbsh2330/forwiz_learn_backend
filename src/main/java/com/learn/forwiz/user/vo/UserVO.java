package com.learn.forwiz.user.vo;

import lombok.Data;

@Data
public class UserVO {
	int userNo;				//회원번호
	String password;		//비밀번호
	String userNm;			//회원명
	String email;			//이메일
	String contact;			//연락처
	String accountTypeCd;	//로그인경로
	String accountStatusCd;	//계정상태
	String updateDt;		//수정일시
	String registDt;		//생성일시
	String deleteYn;		//삭제여부
}
