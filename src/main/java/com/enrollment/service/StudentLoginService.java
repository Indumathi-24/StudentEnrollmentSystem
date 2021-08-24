package com.enrollment.service;

import org.springframework.http.ResponseEntity;

import com.enrollment.entity.StudentLoginEntity;
import com.enrollment.exception.RollNoNotFoundException;

public interface StudentLoginService {
	ResponseEntity<String> addStudentLoginDetails(Long rollNo, StudentLoginEntity studentLogin) throws RollNoNotFoundException;
	ResponseEntity<String> updateStudentLoginDetails(Long rollNo,Long loginId, StudentLoginEntity studentLogin) throws RollNoNotFoundException;
}
