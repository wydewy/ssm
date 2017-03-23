package com.wydewy.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wydewy.manager.mapper.UserMapper;
import com.wydewy.manager.pojo.User;
import com.wydewy.manager.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

}
