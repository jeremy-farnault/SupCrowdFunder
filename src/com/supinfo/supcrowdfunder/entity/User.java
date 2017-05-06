package com.supinfo.supcrowdfunder.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@SuppressWarnings("serial")
@Table(name="USERS")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable{
	
	@Id 
	@GeneratedValue
	private long userId;
	
	private String name;
	private String lastName;
	private String password;
	
	@Column(nullable=false, unique=true)
	private String mailAddress;
	private int uright;
	
	@XmlTransient
	@OneToMany(mappedBy="user")
	private List<Donate> listDonate;

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public int getUright() {
		return uright;
	}
	public void setUright(int uright) {
		this.uright = uright;
	}
	public List<Donate> getListDonate() {
		return listDonate;
	}
	public void setListDonate(List<Donate> listDonate) {
		this.listDonate = listDonate;
	}
}