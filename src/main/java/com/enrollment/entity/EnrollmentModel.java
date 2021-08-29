package com.enrollment.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnrollmentModel {
	private Long rollNo;
	private String courseCode;
	private Long id;
	public EnrollmentModel(Long rollNo, String courseCode, Long id) {
		super();
		this.rollNo = rollNo;
		this.courseCode = courseCode;
		this.id = id;
	}
	
}
