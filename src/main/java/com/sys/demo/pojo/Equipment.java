package com.sys.demo.pojo;

public class Equipment {
	private String eid;
	private String uname;
	private String location;
	private String estate;
	private String etime;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	@Override
	public String toString() {
		return "Equipment [eid=" + eid + ", uname=" + uname + ", location=" + location + ", estate=" + estate
				+ ", etime=" + etime + "]";
	}
}
