package com.offcn.dld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;

@Service
public class DldDemo {
	@Autowired
	private ShiroUserMapper mapper;
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

}
