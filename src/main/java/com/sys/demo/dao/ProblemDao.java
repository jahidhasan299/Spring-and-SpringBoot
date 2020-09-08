package com.sys.demo.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sys.demo.pojo.Problem;

public interface ProblemDao {
	@Insert("insert into problem(pid,username,phone,location,statement,urgence,etime) values(#{pid},#{username},#{phone},#{location},#{statement},#{urgence},#{etime})")
	public int addProblem(Problem problem) throws SQLException;
	@Select("select * from problem where state='待维护'")
	public  List<Problem> getAllProblem() throws SQLException;
	@Select("select * from problem where state='维护中'")
	public  List<Problem> getAllProblem1() throws SQLException;
	@Select("select * from problem where state='维修完成'")
	public  List<Problem> getAllProblem2() throws SQLException;
	@Update("update problem set state='维护中',uname=#{uname},unumber=#{unumber} where pid=#{pid}")
    public int updateProblem(Problem problem) throws SQLException;
	@Select("select * from problem where state='维护中' and unumber=#{unumber}")
	public  List<Problem> getWork(String unumber) throws SQLException;
	@Select("select * from problem where de=0 and state='维修完成' and unumber=#{unumber}")
	public  List<Problem> getWork1(String unumber) throws SQLException;
	@Update("update problem set state='维修完成' where pid=#{pid}")
    public int updateProblem1(Problem problem) throws SQLException;
	@Select("SELECT * FROM problem p WHERE state='待维护' and DATE(p.etime)=DATE(#{etime})")
	public  List<Problem> getProblemByTime(Date etime) throws SQLException;
	@Select("SELECT * FROM problem p WHERE state='维护中' and DATE(p.etime)=DATE(#{etime})")
	public  List<Problem> getProblemByTime1(Date etime) throws SQLException;
	@Select("SELECT * FROM problem p WHERE state='维修完成' and DATE(p.etime)=DATE(#{etime})")
	public  List<Problem> getProblemByTime2(Date etime) throws SQLException;
	@Update("update problem set de=1 where pid=#{pid}")
    public int updateProblem2(Problem problem) throws SQLException;
	@Delete("delete from problem where pid=#{pid}")
	public int del(int pid) throws SQLException;
}
