package com.offcn.mb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;
import com.offcn.pojo.ShiroUserExample;
import com.offcn.service.ShiroUserService;

public class ServiceD implements ShiroUserService {


	@Autowired
	private ShiroUserMapper mapper;
	
	public List<ShiroUser> findAllUser() {
		ShiroUserExample example = new ShiroUserExample();
		List<ShiroUser> list = mapper.selectByExample(example);
		return list;
	}
}