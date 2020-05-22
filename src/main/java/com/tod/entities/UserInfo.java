package com.tod.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uId;
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private String mobile;
	private String password;
	private String userPic;
	private String address;

	private String userType;
	
	private boolean isActive;
	
	
//	@OneToMany(mappedBy = "userinfo")
//	private List<Address> address;
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserPic() {
		return userPic;
	}
	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}
	
//	public List<Address> getAddress() {
//		return address;
//	}
//	public void setAddress(List<Address> address) {
//		this.address = address;
//	}
	public UserInfo( String name, String email, String mobile, String password, String userPic,
		String address	,String userType,boolean isActive) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.userPic = userPic;
		this.address = address;
		this.userType =  userType;
		this.isActive = isActive;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserInfo [uId=" + uId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", userPic=" + userPic + ", address=" + address + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
