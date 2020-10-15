package com.frontdesk.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.frontdesk.entity.patients;

public interface PatientsDao extends JpaRepository<patients, Long>{

	@Query(value = "select * from patients where hospitalid=?1 and status=?2",nativeQuery = true)
	List<patients> getNumbers(long id, String string);

	
}
