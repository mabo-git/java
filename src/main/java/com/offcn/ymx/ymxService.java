package com.offcn.ymx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;

@Service
public class ymxService {
	
	@Autowired
	private ShiroUserMapper mapper;
	
	public void findAllUser() {
		mapper.selectByExample(null);
	}
	
}
