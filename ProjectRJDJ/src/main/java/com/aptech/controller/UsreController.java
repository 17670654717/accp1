package com.aptech.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.domain.User;
import com.aptech.service.UserService;


@Controller
@RequestMapping("/user")
public class UsreController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,String> selectNameAndPwd(User user, HttpSession session) {
		System.out.println("进入登陆！");
		User u = service.selectNamaAndPwd(user.getUaccount(), user.getUpwd());
		Map<String,String> map = new HashMap<String,String>();
		if(u!=null) {
			map.put("code", "200");
			map.put("message", "登陆成功");
			session.setAttribute("user", u);
		}else {
			map.put("code", "500");
			map.put("message", "账号或密码错误！");
		}
		return map;
	}
}
