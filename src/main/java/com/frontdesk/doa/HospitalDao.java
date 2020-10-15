package com.frontdesk.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.frontdesk.entity.Hospital;

public interface HospitalDao extends JpaRepository<Hospital, Long>{

	@Query(value = "select * from hospital where name =?1",nativeQuery = true)
	Hospital getId(String name);

}
