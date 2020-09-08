package com.sys.demo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Problem {
	private int pid;
	private String uname;
	private String phone;
	private String location;
	private String statement;
	private String state;
	private String unumber;
	private String urgence;
	private String username;
	private int de;
	
	public int getDe() {
		return de;
	}
	public void setDe(int de) {
		this.de = de;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date etime;
	public String getUnumber() {
		return unumber;
	}
	public void setUnumber(String unumber) {
		this.unumber = unumber;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	@Override
	public String toString() {
		return "Problem [pid=" + pid + ", uname=" + uname + ", phone=" + phone + ", location=" + location
				+ ", statement=" + statement + ", state=" + state + ", unumber=" + unumber + ", urgence=" + urgence
				+ ", username=" + username + ", de=" + de + ", etime=" + etime + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUrgence() {
		return urgence;
	}
	public void setUrgence(String urgence) {
		this.urgence = urgence;
	}
	
}
