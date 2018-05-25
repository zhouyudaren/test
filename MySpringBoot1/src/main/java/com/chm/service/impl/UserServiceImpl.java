package com.chm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chm.dao.UserDao;
import com.chm.entity.User; 
import com.chm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public List<User> getList() {
		// TODO Auto-generated method stub
		return userDao.getList();
	}

}
