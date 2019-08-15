package com.example.hector.record;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/hector/records")
@Slf4j
@RequiredArgsConstructor
public class HealthRecordAPI {
	
	private final HealthRecordService healthRecordService;
	
	    @GetMapping
	    public ResponseEntity<List<HealthRecord>>getAll() {
	        return ResponseEntity.ok(healthRecordService.findAll());
	    }

	    @PostMapping
	    public ResponseEntity<HealthRecord> create(@Valid @RequestBody HealthRecord healthRecord){
	        return ResponseEntity.ok(healthRecordService.save(healthRecord));
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<HealthRecord> findById(@PathVariable Long id) {
	      
	    	Optional<HealthRecord> record = healthRecordService.findById(id);
	        if (!record.isPresent()) {
	            log.error("Id " + id + " is not existed");
	            ResponseEntity.badRequest().build();
	        }

	        return ResponseEntity.ok(record.get());
	        
	    }
	    
	    @GetMapping("/id")
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<HealthRecord> update(@PathVariable Long id, @Valid @RequestBody HealthRecord healthRecord) {
	        if (!healthRecordService.findById(id).isPresent()) {
	            log.error("Id " + id + " is not existed");
	            ResponseEntity.badRequest().build();
	        }

	        return ResponseEntity.ok(healthRecordService.save(healthRecord));
	    }
	   
	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> delete (@PathVariable Long id) {
	        if (!healthRecordService.findById(id).isPresent()) {
	            log.error("Id " + id + " is not existed");
	            ResponseEntity.badRequest().build();
	        }

	        healthRecordService.deleteById(id);
	        return ResponseEntity.ok().build();
	    }

}
