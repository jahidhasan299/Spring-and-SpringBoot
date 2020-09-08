package com.sys.demo.pojo;

public class User {
	private int uid;
	private String uname;
	private String unumber;
	private String password;
	private String uphone;
	private String cardid;
	private String usex;
	private String salary;
	private String ustate;
	private String ulevel;
	public String getUnumber() {
		return unumber;
	}
	public void setUnumber(String unumber) {
		this.unumber = unumber;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getUstate() {
		return ustate;
	}
	public void setUstate(String ustate) {
		this.ustate = ustate;
	}
	public String getUlevel() {
		return ulevel;
	}
	public void setUlevel(String ulevel) {
		this.ulevel = ulevel;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", unumber=" + unumber + ", password=" + password + ", uphone="
				+ uphone + ", cardid=" + cardid + ", usex=" + usex + ", salary=" + salary + ", ustate=" + ustate
				+ ", ulevel=" + ulevel + "]";
	}
	
}
