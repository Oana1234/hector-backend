package com.example.hector.record;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.hector.record.HealthRecordType;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {

	@Query("SELECT new com.example.hector.record.HealthRecordType(r.id, r.recorded, r.descriptive,r.quantitative, t.name, t.unit) "
			+ "FROM IndicatorType t INNER JOIN t.records r")
	List<HealthRecordType> fetchHealthRecordTypeDataInnerJoin();
	
	@Query("SELECT new com.example.hector.record.HealthRecordType(r.id, r.recorded, r.descriptive,r.quantitative, t.name, t.unit) "
			+ "FROM IndicatorType t INNER JOIN t.records r WHERE t.name=:name")
	List<HealthRecordType> fetchHealthRecordTypeDataByName(@Param("name") String name);
	

	@Query("SELECT new com.example.hector.record.HealthRecordUser(r.id, u.id, r.recorded, r.descriptive,r.quantitative) "
			+ "FROM User u INNER JOIN u.records r")
	List<HealthRecordUser> fetchHealthRecordUserDataInnerJoin();
	
	@Query("SELECT new com.example.hector.record.HealthRecordUser(r.id, u.id, r.recorded, r.descriptive,r.quantitative) "
			+ "FROM User u INNER JOIN u.records r WHERE u.id=:id")
	List<HealthRecordUser> fetchHealthRecordUserDataById(@Param("id") Long id);
	
}