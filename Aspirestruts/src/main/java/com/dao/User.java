package com.dao;

public class User {
	
	private int uid,flag;
	private String uname,upass;
	
public User() {
	// TODO Auto-generated constructor stub
}	
	
	public User(int uid, String uname, String upass, int flag) {
		
		this.uid = uid;
		this.flag = flag;
		this.uname = uname;
		this.upass = upass;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upass=" + upass +", flag=" + flag +  "]";
	}
	
	

}
