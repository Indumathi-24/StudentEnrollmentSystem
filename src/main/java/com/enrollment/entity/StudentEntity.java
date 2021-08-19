package com.enrollment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentPersonal")
public class StudentEntity {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(nullable=false,unique=true)
     private Integer rollNo;
	 @Column(nullable=false)
     private String firstName;
	 @Column(nullable=false)
     private String lastName;
	 @Column(nullable=false)
     private String dateOfBirth;
	 @Column(nullable=false)
     private String gender;
	 @Column(nullable=false,unique=true)
     private String email;
	 @Column(nullable=false)
     private Long contactNo;
	 @Column(nullable=false)
     private String address;
	public StudentEntity(Integer rollNo, String firstName, String lastName, String dateOfBirth, String gender,
			String email, Long contactNo, String address) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
	}
	public StudentEntity(){
		
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentEntity [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", email=" + email + ", contactNo="
				+ contactNo + ", address=" + address + "]";
	}
	
}
