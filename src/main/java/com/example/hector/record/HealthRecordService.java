package com.example.hector.record;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HealthRecordService {
	
	private final HealthRecordRepository healthRecordRepository;
	
	private List<HealthRecordTypeUser> listByUserAndType;
	
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

			List<HealthRecordType> list = healthRecordRepository.fetchHealthRecordTypeDataInnerJoin();
			list.forEach(l -> System.out.println(l));
			return list;
	    }
	    
	    public List<HealthRecordType>getJoinedRecordsTypesByName(String name) {

			List<HealthRecordType> list = healthRecordRepository.fetchHealthRecordTypeDataByName(name);
			list.forEach(l -> System.out.println(l));
			return list;
	    }
	    
	    public List<HealthRecordUser>getJoinedRecordsUsers() {

			List<HealthRecordUser> list = healthRecordRepository.fetchHealthRecordUserDataInnerJoin();
			list.forEach(l -> System.out.println(l));
			return list;
	    }
	 
	    
	    public List<HealthRecordUser>getJoinedRecordsUsersById(Long id) {

			List<HealthRecordUser> list = healthRecordRepository.fetchHealthRecordUserDataById(id);
			list.forEach(l -> System.out.println(l));
			return list;
	    }
	    
	    //temporary solution for inner join 3 tables
	    /*    public List<HealthRecordTypeUser>getJoinedRecordsByUserAndIndicator(Long id, String name){
	    	
			List<HealthRecordType> listByType = healthRecordRepository.fetchHealthRecordTypeDataByName(name);
			List<HealthRecordUser> listByUser = healthRecordRepository.fetchHealthRecordUserDataById(id);
			listByUserAndType = null;
			
			for(HealthRecordType t : listByType) {
				for(HealthRecordUser u : listByUser) {
					if (t.getRecordId() == u.getRecordId()) {
						HealthRecordTypeUser x = new HealthRecordTypeUser(u.getRecordId(),u.getUserId(),u.getRecorded(),u.getDescriptive(),u.getQuantitative(),t.getIndicatorType(),t.getIndicatorUnit());
				        listByUserAndType.add(x);
					}
				}
			}

			return listByUserAndType;
	    	
	    }	
	  */
}
