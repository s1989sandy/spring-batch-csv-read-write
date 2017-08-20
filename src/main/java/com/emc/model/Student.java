package com.emc.model;

public class Student {
	private String sId;
	private String sName;
	private String sPhone;
	private String sMail;
	private String sAddress;
	
	
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPhone() {
		return sPhone;
	}
	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	public String getsMail() {
		return sMail;
	}
	public void setsMail(String sMail) {
		this.sMail = sMail;
	}
	

}
