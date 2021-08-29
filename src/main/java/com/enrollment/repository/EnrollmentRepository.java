package com.enrollment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.enrollment.entity.EnrollmentEntity;
import com.enrollment.entity.EnrollmentModel;
@Repository
public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity,Long>{
	@Query("SELECT new com.enrollment.entity.EnrollmentModel(e.student.rollNo,e.course.courseCode,e.staff.id) FROM EnrollmentEntity e WHERE e.student.rollNo=:rollNo AND e.course.semester.id=:semId AND e.course.department.deptId=:deptId")
	List<EnrollmentModel> findByRollNo(@Param("rollNo") Long rollNo,@Param("semId") Long semId,@Param("deptId") Long deptId);

}
