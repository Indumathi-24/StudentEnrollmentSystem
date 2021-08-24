package com.enrollment.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="StudentPersonal")
public class StudentEntity implements Serializable {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
     @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
     @JoinColumn(name="rollNo",nullable=false)
     @JsonIgnore
 	 private StudentAssignEntity studentAssign;
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
	// @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="studentPersonal")
	 //private StudentLoginEntity userId;
	//public StudentLoginEntity getUserId() {
		//return userId;
	//}
	//public void setUserId(StudentLoginEntity userId) {
		//this.userId = userId;
	//}
	
	public StudentEntity(){
		
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
	public StudentAssignEntity getStudentAssign() {
		return studentAssign;
	}
	public void setStudentAssign(StudentAssignEntity studentAssign) {
		this.studentAssign = studentAssign;
	}
	public StudentEntity(StudentAssignEntity studentAssign, String firstName, String lastName, String dateOfBirth,
			String gender, String email, Long contactNo, String address, StudentLoginEntity userId) {
		super();
		this.studentAssign = studentAssign;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		//this.userId = userId;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", studentAssign=" + studentAssign + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", email=" + email
				+ ", contactNo=" + contactNo + ", address=" + address + "]";
	}
	
}
