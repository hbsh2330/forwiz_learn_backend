package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.vo.TestVO;

@Mapper
public interface TestMapper {
	List<TestVO> selectTest();
}
