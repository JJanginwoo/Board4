package com.goodee.dao;

import org.apache.ibatis.annotations.Mapper;

import com.goodee.vo.UserVO;

@Mapper
public interface NURIDAO {
	public int insertmembership(UserVO vo);
	
}
