package com.learn.forwiz.client.user.vo;

import lombok.Data;

@Data
public class UserVO {
	private int userNo;				//회원번호
	private String password;		//비밀번호
	private String userNm;			//회원명
	private String email;			//이메일
	private String contact;			//연락처
	private String accountTypeCd;	//로그인경로
	private String accountStatusCd;	//계정상태
	private String updateDt;		//수정일시
	private String registDt;		//생성일시
	private String deleteYn;		//삭제여부
}
