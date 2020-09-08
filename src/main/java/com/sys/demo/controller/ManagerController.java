package com.sys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.demo.pojo.Manager;
import com.sys.demo.service.ManagerService;
@Controller
public class ManagerController {
	@Autowired
	private ManagerService managerService;
	@RequestMapping("/getManager")
	@ResponseBody
	public boolean getManager(Manager manager){
		boolean flag = false;
		String mnumber = manager.getMnumber();
		String password = manager.getPassword();
		try {
			Manager manager1 = managerService.getManager(mnumber);
			String password1 = manager1.getPassword();
			if(password1!=null && password1.equals(password)){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/updateManager")
	@ResponseBody
	public boolean updateManager(Manager manager){
		boolean flag = false;
		try {
			 flag = managerService.updateManager(manager);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getPasswordM")
	@ResponseBody
	public Manager getPasswordM(String mnumber,String mphone){
		Manager manager = new Manager();
		try {
			manager = managerService.getPasswordM(mnumber,mphone);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return manager;
	}
	@RequestMapping("/getManager1")
	@ResponseBody
	public Manager getManager1(Manager manager){
		try {
			manager = managerService.getManager1(manager);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return manager;
	}
}
