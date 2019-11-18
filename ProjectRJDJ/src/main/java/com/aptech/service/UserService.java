package com.aptech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aptech.domain.User;
import com.aptech.mapper.UserMapper;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public User selectNamaAndPwd(String uaccount, String upwd) {
		return mapper.selectNameAndPwd(uaccount, upwd);
	}
}
