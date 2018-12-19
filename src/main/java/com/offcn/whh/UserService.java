/**
 * 
 */
package com.offcn.whh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;

/**描述：
 * @author 王浩浩
 * @Date 2018年12月19日 上午9:37:04
 */

@Service
public class UserService {
	
	@Autowired
	private ShiroUserMapper mapper;
	
	public ShiroUser selectByPrimaryKey(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
	
	
}
