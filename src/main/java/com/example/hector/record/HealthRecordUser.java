package com.example.hector.record;

import java.util.Date;

public class HealthRecordUser {

	private Long   recordId;
	private Long   userId;
    private Date   recorded; 
	private String descriptive;
    private Float  quantitative;
    
	public HealthRecordUser(Long recordId, Long userId, Date recorded, String descriptive, Float quantitative) {
		super();
		this.recordId = recordId;
		this.userId = userId;
		this.recorded = recorded;
		this.descriptive = descriptive;
		this.quantitative = quantitative;
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
	
	@Override
	public String toString() {
		return "HealthRecordUser [recordId=" + recordId + ", userId=" + userId + ", recorded=" + recorded
				+ ", descriptive=" + descriptive + ", quantitative=" + quantitative + ", indicatorUnit=" 
				+ "]";
	}
 
}
    
	
      
	    
