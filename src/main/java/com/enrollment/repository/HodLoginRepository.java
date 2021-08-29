package com.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.enrollment.entity.HodLoginEntity;
@Repository
public interface HodLoginRepository extends JpaRepository<HodLoginEntity,Long>{
	@Query("FROM HodLoginEntity h WHERE h.hodPersonal.id=:hodId")
	HodLoginEntity getByHodId(@Param("hodId") Long hodId);

}
