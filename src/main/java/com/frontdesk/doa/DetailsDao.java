package com.frontdesk.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.frontdesk.entity.Details;

public interface DetailsDao extends JpaRepository<Details	, Long> {

	@Query(value = "Select * from details where hospitalid=?1 and type=?2",nativeQuery = true)
	List<Details> getDetails(long id, String spec);

}
