package com.example.hector.indicator;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class HealthIndicator {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @CreationTimestamp
    private Date recorded;

    private String name;

    private String img;
    
    private String descriptive;
    
    private Float quantitative;
    
    private String unit;
    
    private Boolean selected;

}
