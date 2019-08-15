package com.example.hector.indicator;

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

@Data
@EqualsAndHashCode(exclude = "records")

@Entity
public class IndicatorType{
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy = "indicatorType", cascade = CascadeType.ALL)
    private Set<HealthRecord> records;
    
    private String name;

    private String unit;
    
    private String description;
    
}
