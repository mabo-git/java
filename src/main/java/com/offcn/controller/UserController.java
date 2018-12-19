package com.offcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.pojo.ShiroUser;
import com.offcn.service.ShiroUserService;

/**
 * 用户管理的controller
 * 可以对用户进行CRUD操作
 * @author luoyanpeng
 *
 */
@Controller
public class UserController {

	@Autowired
	private ShiroUserService service;
	
	//  查询到所有用户，然后到主界面展示
	@RequestMapping("/home")
	public String getHome(Model model){
		List<ShiroUser> users = service.findAllUser();
		model.addAttribute("users", users);
		return "home";
	}
}







 