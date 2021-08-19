package com.enrollment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enrollment.entity.StudentEntity;
import com.enrollment.repository.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public StudentEntity addStudentDetails(StudentEntity student) {
		return studentDAO.save(student);
	}
	
	@Override
	public List<StudentEntity> getAllStudentDetails() 
	{
	return studentDAO.findAll();
	}

	@Override
	public StudentEntity getStudentDetailById(int rollNo) {
		return studentDAO.findById(rollNo).get();
	}
	
	
	
}


