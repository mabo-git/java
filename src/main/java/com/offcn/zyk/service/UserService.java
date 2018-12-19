/**
 * 
 */
package com.offcn.zyk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;
import com.offcn.pojo.ShiroUserExample;

/**
 * 描述：
 * 张雁开
 * @Date  2018年12月19日
 */
@Service
public class UserService  {
 
	@Autowired
	private ShiroUserMapper mapper;
	
	public List<ShiroUser> getUsers(){
		return mapper.selectByExample(new ShiroUserExample());
	}
}
