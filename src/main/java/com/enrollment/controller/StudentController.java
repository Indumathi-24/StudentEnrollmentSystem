package com.enrollment.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollment.entity.StudentEntity;
import com.enrollment.exception.RollNoNotFoundException;
import com.enrollment.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
     @Autowired
     private StudentService studentService;
     
     @PostMapping("/studentinsertion")
     public ResponseEntity<String> addStudentDetails(@RequestBody StudentEntity student) throws RollNoNotFoundException{
    	 StudentEntity s=studentService.addStudentDetails(student);
    	 if(s==null) {
    		 throw new RollNoNotFoundException("Roll No is invalid");
    	 }
    	 else {
    		 return new ResponseEntity<String>("Student added Successsfully",new HttpHeaders(),HttpStatus.OK);
    	 }
     }
     
     @GetMapping("/getAllStudent")
     public ResponseEntity<List<StudentEntity>> getAllStudentDetails(){
    	 List<StudentEntity> studentList=studentService.getAllStudentDetails();
    	 return new ResponseEntity<List<StudentEntity>>(studentList,new HttpHeaders(),HttpStatus.OK);
    	 }
    
     @GetMapping("/getStudentById/{rollNo}")
     public ResponseEntity<StudentEntity> getStudentDetailById(@PathVariable("rollNo") int rollNo) throws RollNoNotFoundException{
     StudentEntity s=studentService.getStudentDetailById(rollNo);
    			if (s == null) {
    				throw new RollNoNotFoundException("Roll No does not exist,so we couldn't fetch details");
    			} else {
    				return new ResponseEntity<StudentEntity>(s, new HttpHeaders(), HttpStatus.OK);
    			}
    		}

	 }

     
     
     

