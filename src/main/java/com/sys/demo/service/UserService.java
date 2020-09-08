package com.sys.demo.service;

import java.util.List;

import com.sys.demo.pojo.User;

public interface UserService {
	public boolean addUser(User user) throws Exception;
	public User getUserByNumber(String unumber)throws Exception;
	public User getUserByNumber1(String unumber)throws Exception;
	public  List<User> getAll() throws Exception;
	public User getUserByCardid(String cardid) throws Exception;
	public boolean deleteUser(int uid) throws Exception;
	public boolean updateUser(User user) throws Exception;
	public boolean updateSalary(User user) throws Exception;
	public boolean updateUstate(User user) throws Exception;
	public User getUser(String unumber) throws Exception;
	public User getPassword(String unumber,String uphone) throws Exception;
	public  List<User> getAllFree() throws Exception;
	public boolean updateUstate1(User user) throws Exception;
	public User getUserByNumber2(User user)throws Exception;
	public boolean updateS(User user) throws Exception;
	public boolean updateUstate2(User user) throws Exception;
}
