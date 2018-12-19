package com.offcn.nzjservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.nzjservice.NzjService;
import com.offcn.pojo.ShiroUser;

@Service
public class NzjServiceImpl  implements NzjService{
    @Autowired
	private ShiroUserMapper mapper;
	public int insert(ShiroUser record) {
		
		return mapper.insert(record);
	}
               
}
