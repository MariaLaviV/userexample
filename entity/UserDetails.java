package com.example.userexample.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="USER_DETAILS")
@DynamicInsert
@DynamicUpdate
public class UserDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7572807768823956481L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="POSITION")
	private String position;
	
	@Column(name="ORG_NAME")
	private String organizationName;
	
	@Column(name="DEPT")
	private String department;
	
	@Column(name="PHONE")
	private Long telephone;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="POST_CODE")
	private Long postCode;
	
	@Column(name="EMAIL")
	private String emailAddress;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="OTP")
	private int otp;

	/**
	 * 
	 */
	public UserDetails() { }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPostCode() {
		return postCode;
	}

	public void setPostCode(Long postCode) {
		this.postCode = postCode;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", position="
				+ position + ", organizationName=" + organizationName + ", department=" + department + ", telephone="
				+ telephone + ", country=" + country + ", postCode=" + postCode + ", emailAddress=" + emailAddress
				+ ", password=" + password + ", otp=" + otp + "]";
	}

		
}
