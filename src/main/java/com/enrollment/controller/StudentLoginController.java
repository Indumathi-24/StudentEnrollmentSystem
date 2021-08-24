package com.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollment.entity.StudentLoginEntity;
import com.enrollment.exception.RollNoNotFoundException;
import com.enrollment.service.StudentLoginService;


@RestController
@RequestMapping("/studentLogin")
public class StudentLoginController {
	
	     @Autowired
	     private StudentLoginService studentLoginService;
	     
	     @PostMapping("/studentAssignInsertion/{rollNo}/studentLogininsertion")
	     public ResponseEntity<String> addStudentLoginDetails(@PathVariable("rollNo") Long rollNo,@RequestBody StudentLoginEntity student) throws RollNoNotFoundException
	     {
	     return studentLoginService.addStudentLoginDetails(rollNo,student);
	     }
	     
	     @PutMapping("/updateStudent/{rollNo}/updateStudentLogin/{loginId}")
	     public ResponseEntity<String> updateStudentLoginDetails(@PathVariable("rollNo") Long rollNo,@PathVariable("loginId") Long loginId,@RequestBody StudentLoginEntity student) throws RollNoNotFoundException
	     {
	        return studentLoginService.updateStudentLoginDetails(rollNo,loginId,student);
	        
	     }
}
