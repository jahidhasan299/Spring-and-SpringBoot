package com.sys.demo.service;

import com.sys.demo.pojo.Manager;

public interface ManagerService {
	public Manager getManager(String mnumber) throws Exception;
	public boolean updateManager(Manager manager) throws Exception;
	public Manager getPasswordM(String mnumber,String mphone) throws Exception;
	public Manager getManager1(Manager manager) throws Exception;
}
