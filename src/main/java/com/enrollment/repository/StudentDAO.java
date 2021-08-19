package com.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enrollment.entity.StudentEntity;

public interface StudentDAO extends JpaRepository<StudentEntity,Integer>{

}
