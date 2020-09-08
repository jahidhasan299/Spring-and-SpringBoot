package com.sys.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.demo.pojo.User;
import com.sys.demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/addUser")
	@ResponseBody
	public boolean addUser(User user){
		boolean flag = true;
		try {
			flag = userService.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getUserByNumber")
	@ResponseBody
	public boolean getUserByNumber(String unumber){
		User user = new User();
		boolean flag=false;
		try {
			user = userService.getUserByNumber(unumber);
			if(user==null){
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getUserByNumber1")
	@ResponseBody
	public User getUserByNumber1(String unumber){
		User user = new User();
		try {
			user = userService.getUserByNumber1(unumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	@RequestMapping("/getUserByCardid")
	@ResponseBody
	public User getUserByCardid(String cardid){
		User user = new User();
		try {
			user = userService.getUserByCardid(cardid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	@RequestMapping("/getAll")
	@ResponseBody
	public List<User> getAll(User user){
		List<User> list = new ArrayList<User>();
		try {
			list = userService.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/deleteUser")
	@ResponseBody
	public boolean deleteUser(Integer uid){
		boolean flag = false;
		try {
			flag = userService.deleteUser(uid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/updateUser")
	@ResponseBody
	public boolean updateUser(User user){
		boolean flag = false;
		try {
			 flag = userService.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/updateSalary")
	@ResponseBody
	public boolean updateSalary(User user){
		boolean flag = false;
		try {
			 flag = userService.updateSalary(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/updateUstate")
	@ResponseBody
	public boolean updateUstate(User user){
		boolean flag = false;
		try {
			 flag = userService.updateUstate(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getUser")
	@ResponseBody
	public boolean getUser(User user){
		boolean flag = false;
		String unumber = user.getUnumber();
		String password = user.getPassword();
		try {
			User user1 = userService.getUser(unumber);
			String password1 = user1.getPassword();
			if(password1!=null && password1.equals(password)){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getPassword")
	@ResponseBody
	public User getPassword(String unumber,String uphone){
		User user = new User();
		try {
			user = userService.getPassword(unumber,uphone);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	@RequestMapping("/getAllFree")
	@ResponseBody
	public List<User> getAllFree(User user){
		List<User> list = new ArrayList<User>();
		try {
			list = userService.getAllFree();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/updateUstate1")
	@ResponseBody
	public boolean updateUstate1(User user){
		boolean flag = false;
		try {
			 flag = userService.updateUstate1(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getUserByNumber2")
	@ResponseBody
	public User getUserByNumber2(User user){
		try {
			user = userService.getUserByNumber2(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	@RequestMapping("/updateS")
	@ResponseBody
	public boolean updateS(User user){
		boolean flag = false;
		try {
			 flag = userService.updateS(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/updateUstate2")
	@ResponseBody
	public boolean updateUstate2(User user){
		boolean flag = false;
		try {
			 flag = userService.updateUstate2(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
}
