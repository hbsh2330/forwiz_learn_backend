package com.learn.forwiz.admin.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.forwiz.admin.user.service.AdminUserService;
import com.learn.forwiz.admin.user.vo.AdminUserVO;

@RestController
@RequestMapping("/api/admin/user")
public class AdminUserController {

	@Autowired
	AdminUserService userService;

	@GetMapping("/selectUserList.do")
	public List<AdminUserVO> selectUserList(@ModelAttribute AdminUserVO vo) {

		return userService.selectUserList(vo);
	}

	@PostMapping("/updateUserRole.do")
	public Map<String, String> updateUserRole(@RequestBody Map<String, Object> paramMap) {
		String type = (String) paramMap.get("type");
		Map<String, String> responseMessage = new HashMap<>();
		try {
			userService.updateUserRole(paramMap); // 서비스 호출
			// type에 따른 메시지 반환
			if ("admin".equals(type)) {
				responseMessage.put("message", "관리자로 등록이 되었습니다.");
			} else if ("user".equals(type)) {
				responseMessage.put("message", "회원으로 수정 되었습니다.");
			}
		} catch (Exception e) {
			responseMessage.put("message", "처리 중 오류가 발생했습니다.");
		}

		return responseMessage;
	}
	@GetMapping("/selectUserDetail.do")
	public List<AdminUserVO> selectUserDetail(@RequestParam("userNo") Long userNo) {
		System.out.println("userNo :" + userNo);

		return userService.selectUserDetail(userNo);
	}
	
	
}
