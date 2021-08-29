package com.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enrollment.entity.HodEntity;
@Repository
public interface HodRepository extends JpaRepository<HodEntity,Long>{

}
