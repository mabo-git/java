package com.offcn.ljz;

import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;

@Service
public class Test4Ljz {

	private ShiroUserMapper shiroUserMapper;
	
	public void addShiroUser() {
		ShiroUser su = new ShiroUser();
		su.setId(110);
		su.setUserName("李加真");
		su.setPassword("123456");
		shiroUserMapper.insert(su);
	}
}
