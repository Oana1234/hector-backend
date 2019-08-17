package com.example.hector.record;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.example.hector.indicator.IndicatorType;
import com.example.hector.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data


@Entity
public class HealthRecord {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private IndicatorType indicatorType; 

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private User user;
    
    @CreationTimestamp
    private Date recorded;
    
    private String descriptive;
    
    private Float quantitative;
    
    private String notes;


}
