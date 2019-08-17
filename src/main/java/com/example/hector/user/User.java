package com.example.hector.user;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.hector.record.HealthRecord;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = "records")

public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<HealthRecord> records;

	 private String name;
	 
	 private String gender;
	 
	 private int year;
	 
	 private Float height;
	 
	 private Float weight;

	 private String activity;
	 
	 

}
