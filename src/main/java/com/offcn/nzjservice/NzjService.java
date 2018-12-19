package com.offcn.nzjservice;

import org.springframework.stereotype.Service;

import com.offcn.pojo.ShiroUser;

@Service
public interface NzjService {
	public int insert(ShiroUser record);
}
