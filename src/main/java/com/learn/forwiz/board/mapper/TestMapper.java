package com.learn.forwiz.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.learn.forwiz.board.vo.TestVO;

@Mapper
public interface TestMapper {
	List<TestVO> selectTest();
}
