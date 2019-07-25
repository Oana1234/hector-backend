package com.example.hector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class HealthIndicator {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indicator_id;

    private String name;

    private String img_id;

}
