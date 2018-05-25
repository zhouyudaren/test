package com.chm.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chm.entity.User;
import com.chm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list.do")
	public String getlist(HttpServletRequest request){
		List<User> list = userService.getList();
		System.out.println(list);
		return "WEB-INF/view/NewFile2";
	}
}
