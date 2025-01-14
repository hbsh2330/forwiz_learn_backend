package com.learn.forwiz.board.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.forwiz.board.mapper.TestMapper;
import com.learn.forwiz.board.service.TestService;
import com.learn.forwiz.board.vo.TestVO;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestMapper testMapper;
	
	@Override
	public List<TestVO> selectTest() {
		return testMapper.selectTest();
	}

}
