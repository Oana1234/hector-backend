package com.example.hector.record;
import java.util.Date;

public class HealthRecordTypeUser{
	
	private Long recordId;
	private Long userId;
	 private Date recorded; 
	 private String descriptive;
      private Float quantitative;
      private String indicatorType;
      private String indicatorUnit;
      
            
	public HealthRecordTypeUser(Long recordId, Long userId, Date recorded, String descriptive, Float quantitative,
			String indicatorType, String indicatorUnit) {
		super();
		this.recordId = recordId;
		this.userId  = userId;
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


    public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
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
}