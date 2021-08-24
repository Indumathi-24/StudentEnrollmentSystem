package com.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enrollment.entity.StudentLoginEntity;

@Repository
public interface StudentLoginDAO extends JpaRepository<StudentLoginEntity,Long>{
     
}
