package com.sys.demo.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sys.demo.pojo.Manager;

public interface ManagerDao {
	@Select("select * from manager where mnumber=#{mnumber}")
	public Manager getManager(String mnumber) throws SQLException;
	@Update("update manager set password=#{password},msex=#{msex},mphone=#{mphone},mname=#{mname} where mnumber=#{mnumber}")
	public int updateManager(Manager manager) throws SQLException;
	@Select("select password from manager where mnumber=#{arg0} and mphone=#{arg1}")
	public Manager getPasswordM(String mnumber,String mphone) throws SQLException;
	@Select("select * from manager where mnumber=#{mnumber}")
	public Manager getManager1(Manager manager) throws SQLException;
}
