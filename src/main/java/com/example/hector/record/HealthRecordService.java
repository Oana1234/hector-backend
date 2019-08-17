package com.example.hector.record;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HealthRecordService {
	
	private final HealthRecordRepository healthRecordRepository;
	
	  public List<HealthRecord> findAll() {
	        return healthRecordRepository.findAll();
	    }

	    public Optional<HealthRecord> findById(Long id) {
	        return healthRecordRepository.findById(id);
	    }

	    public HealthRecord save(HealthRecord record) {
	        return healthRecordRepository.save(record);
	    }

	    public void deleteById(Long id) {
	    	healthRecordRepository.deleteById(id);
	    }
	    
	    public List<HealthRecordType>getJoinedRecordsTypes() {

			List<HealthRecordType> list = healthRecordRepository.fetchHEalthRecordTypeDataInnerJoin();
			list.forEach(l -> System.out.println(l));
			return list;
	    }
	    
	   
		
	  
}
