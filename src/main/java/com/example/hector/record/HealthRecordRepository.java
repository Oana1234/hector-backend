package com.example.hector.record;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.hector.record.HealthRecordType;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {

	@Query("SELECT new com.example.hector.record.HealthRecordType(r.id, r.recorded, r.descriptive,r.quantitative, t.name, t.unit) "
			+ "FROM IndicatorType t INNER JOIN t.records r")
	List<HealthRecordType> fetchHEalthRecordTypeDataInnerJoin();

}
