package com.example.demo.board.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.TestMapper;
import com.example.demo.board.service.TestService;
import com.example.demo.board.vo.TestVO;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestMapper testMapper;
	
	@Override
	public List<TestVO> selectTest() {
		return testMapper.selectTest();
	}

}
