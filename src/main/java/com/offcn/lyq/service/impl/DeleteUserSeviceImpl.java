package com.offcn.lyq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.lyq.service.DeleteUserService;
import com.offcn.mapper.ShiroUserMapper;

@Service
public class DeleteUserSeviceImpl implements DeleteUserService{

	@Autowired
	private ShiroUserMapper mapper;
	
	public int DeleteUser(int id) {
		return mapper.deleteByPrimaryKey(id);
	}
	

}
