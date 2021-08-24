package com.enrollment.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.enrollment.entity.StudentLoginEntity;
import com.enrollment.exception.RollNoNotFoundException;
import com.enrollment.repository.StudentAssignDAO;
import com.enrollment.repository.StudentLoginDAO;

@Service
public class StudentLoginServiceImpl implements StudentLoginService{
	@Autowired 
	StudentAssignDAO studentAssignDAO;
	
	@Autowired
	StudentLoginDAO studentLoginDAO;
	
	@Override
    public ResponseEntity<String> addStudentLoginDetails(Long rollNo, StudentLoginEntity studentLogin) throws RollNoNotFoundException {
        return studentAssignDAO.findById(rollNo)
                .map(student->{
                    studentLogin.setStudentAssign(student);
                    studentLoginDAO.save(studentLogin);
                    return new ResponseEntity<String>("Student Login Details added successfully!", new HttpHeaders(), HttpStatus.OK);
                }).orElseThrow(()->new RollNoNotFoundException("Student Not Found!"));
    }
	public ResponseEntity<String> updateStudentLoginDetails(Long rollNo,Long loginId, StudentLoginEntity studentLogin) throws RollNoNotFoundException {
		if(!studentAssignDAO.existsById(rollNo)) {
    		throw new RollNoNotFoundException("Student not found!");
    	}
        return studentLoginDAO.findById(loginId)
                .map(student->{
                    student.setUserName(studentLogin.getUserName());
                    student.setPassword(studentLogin.getPassword());
                    studentLoginDAO.save(student);
                    return new ResponseEntity<String>("Student Login Details Updated successfully!", new HttpHeaders(), HttpStatus.OK);
                }).orElseThrow(()->new RollNoNotFoundException("Student Not Found!"));
    }
	
 
}
