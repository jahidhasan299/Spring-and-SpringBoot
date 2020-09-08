package com.sys.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.demo.dao.ManagerDao;
import com.sys.demo.pojo.Manager;
import com.sys.demo.service.ManagerService;
@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private ManagerDao managerDao;
	@Override
	public Manager getManager(String mnumber) throws Exception {
		Manager manager = managerDao.getManager(mnumber);
		return manager;
	}
	@Override
	public boolean updateManager(Manager manager) throws Exception {
		boolean flag = false;
		int num =  managerDao.updateManager( manager);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public Manager getPasswordM(String mnumber, String mphone) throws Exception {
		Manager manager = managerDao.getPasswordM(mnumber,mphone);
		return manager;
	}
	@Override
	public Manager getManager1(Manager manager) throws Exception {
	     manager = managerDao.getManager1(manager);
		return manager;
	}
}
