package com.example.hector.record;

import java.util.Date;

public class HealthRecordType {

	private Long recordId;
	 private Date recorded; 
	 private String descriptive;
      private Float quantitative;
      private String indicatorType;
      private String indicatorUnit;
      
      
	public HealthRecordType(Long recordId, Date recorded, String descriptive, Float quantitative,
			String indicatorType, String indicatorUnit) {
		super();
		this.recordId = recordId;
		this.recorded = recorded;
		this.descriptive = descriptive;
		this.quantitative = quantitative;
		this.indicatorType = indicatorType;
		this.indicatorUnit = indicatorUnit;
	}


	public Long getRecordId() {
		return recordId;
	}


	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}


	public Date getRecorded() {
		return recorded;
	}


	public void setRecorded(Date recorded) {
		this.recorded = recorded;
	}


	public String getDescriptive() {
		return descriptive;
	}


	public void setDescriptive(String descriptive) {
		this.descriptive = descriptive;
	}


	public Float getQuantitative() {
		return quantitative;
	}


	public void setQuantitative(Float quantitative) {
		this.quantitative = quantitative;
	}


	public String getIndicatorType() {
		return indicatorType;
	}


	public void setIndicatorType(String indicatorType) {
		this.indicatorType = indicatorType;
	}


	public String getIndicatorUnit() {
		return indicatorUnit;
	}


	public void setIndicatorUnit(String indicatorUnit) {
		this.indicatorUnit = indicatorUnit;
	}


	@Override
	public String toString() {
		return "HealthRecordType [recordId=" + recordId + ", recorded=" + recorded + ", descriptive=" + descriptive
				+ ", quantitative=" + quantitative + ", indicatorType=" + indicatorType + ", indicatorUnit="
				+ indicatorUnit + "]";
	}
    
	
      
	    
}