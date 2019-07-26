package com.example.hector.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 
	 private String name;
	 
	 private String gender;
	 
	 private int year;
	 
	 private Float height;
	 
	 private Float weight;

	 private String activity;

}
