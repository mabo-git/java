package com.offcn.xjk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;
import com.offcn.pojo.ShiroUserExample;

@Service
public class TestService {

	@Autowired
	private ShiroUserMapper mapper;
	
	@Transactional
	public List<ShiroUser> selectByExample(ShiroUserExample example){
		
		return mapper.selectByExample(example);
	}
}
