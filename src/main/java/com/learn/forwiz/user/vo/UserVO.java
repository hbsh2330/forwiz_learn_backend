package com.learn.forwiz.user.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserVO {
	private int userNo;
    private String password;
    private String userNm;
    private String email;
    private String contact;
    private String accountTypeCd;
    private String accountStatusCd;
    private LocalDateTime updateDt;
    private LocalDateTime registDt;
    private String deleteYn;
    private LocalDateTime lastLoginAt;
}
