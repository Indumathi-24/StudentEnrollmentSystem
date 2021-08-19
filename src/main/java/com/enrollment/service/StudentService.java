package com.enrollment.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.enrollment.entity.StudentEntity;

public interface StudentService {
	StudentEntity addStudentDetails(StudentEntity student);
	List<StudentEntity> getAllStudentDetails();
	StudentEntity getStudentDetailById(int rollNo);
}
