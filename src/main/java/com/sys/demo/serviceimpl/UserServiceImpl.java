package com.sys.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sys.demo.dao.UserDao;
import com.sys.demo.pojo.User;
import com.sys.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public boolean addUser(User user) throws Exception {
		boolean flag = true;
		int num = userDao.addUser(user);
		if(num != 1){
			flag = false;
		}
		return flag;
	}
	@Override
	public User getUserByNumber(String unumber) throws Exception {
		User user = userDao.getUserByNumber(unumber);
		return user;
	}
	@Override
	public List<User> getAll() throws Exception {
		List<User> list = userDao.getAll();
		return list;
	}
	@Override
	public User getUserByCardid(String cardid) throws Exception {
		User user = userDao.getUserByCardid(cardid);
		return user;
	}
	@Override
	public boolean deleteUser(int uid) throws Exception {
		boolean flag = false;
		int num = userDao.deleteUser(uid);
		if(num == 1){
			flag = true;
		}
		return flag;
	}
	@Override
	public boolean updateUser(User user) throws Exception {
		boolean flag = false;
		int num = userDao.updateUser(user);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public User getUserByNumber1(String unumber) throws Exception {
		User user = userDao.getUserByNumber(unumber);
		return user;
	}
	@Override
	public boolean updateSalary(User user) throws Exception {
		boolean flag = false;
		int num = userDao.updateSalary(user);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public boolean updateUstate(User user) throws Exception {
		boolean flag = false;
		int num = userDao.updateUstate(user);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public User getUser(String unumber) throws Exception {
		User user = userDao.getUser(unumber);
		return user;
	}
	@Override
	public User getPassword(String unumber, String uphone) throws Exception {
		User user = userDao.getPassword(unumber,uphone);
		return user;		
}
	@Override
	public List<User> getAllFree() throws Exception {
		List<User> list = userDao.getAllFree();
		return list;
	}
	@Override
	public boolean updateUstate1(User user) throws Exception {
		boolean flag = false;
		int num = userDao.updateUstate1(user);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public User getUserByNumber2(User user) throws Exception {
		user = userDao.getUserByNumber2(user);
		return user;
	}
	@Override
	public boolean updateS(User user) throws Exception {
		boolean flag = false;
		int num = userDao.updateS(user);
		if(num >=1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public boolean updateUstate2(User user) throws Exception {
		boolean flag = false;
		int num = userDao.updateUstate2(user);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
}
