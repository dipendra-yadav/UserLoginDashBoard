package com.dash.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_INFORMATION")
public class User implements Serializable {

	public User() {
		System.out.println("===========================User Entity is constructed!!==================");

	}

	@Override
	public String toString() {
		return "User [userPrincipalName=" + userPrincipalName + ", displayName=" + displayName + ", employeeID="
				+ employeeID + ", employeeType=" + employeeType + ", sourceSystem=" + sourceSystem + ", userLoginDate="
				+ userLoginDate + ", userLoginTime=" + userLoginTime + ", mobile=" + mobile + ", department="
				+ department + ", mail=" + mail + ", lastLogon=" + lastLogon + ", manager=" + manager + "]";
	}

	@Id
	private String userPrincipalName;
	private String displayName;
	private String employeeID;
	private String employeeType;
	private String sourceSystem;
	private String userLoginDate;
	private String userLoginTime;

	private String mobile;
	private String department;
	private String mail;
	private String lastLogon;
	private String manager;

	// Getters-Setters
	public String getUserPrincipalName() {
		return userPrincipalName;
	}

	public void setUserPrincipalName(String userPrincipalName) {
		this.userPrincipalName = userPrincipalName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getUserLoginDate() {
		return userLoginDate;
	}

	public void setUserLoginDate(String userLoginDate) {
		this.userLoginDate = userLoginDate;
	}

	public String getUserLoginTime() {
		return userLoginTime;
	}

	public void setUserLoginTime(String userLoginTime) {
		this.userLoginTime = userLoginTime;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLastLogon() {
		return lastLogon;
	}

	public void setLastLogon(String lastLogon) {
		this.lastLogon = lastLogon;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

}
