package com.chm.dao;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import com.chm.entity.User;
@ResponseBody
public interface UserDao {

	public List<User> getList();

}
