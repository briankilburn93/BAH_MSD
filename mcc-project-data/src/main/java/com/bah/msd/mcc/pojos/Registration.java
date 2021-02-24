package com.bah.msd.mcc.pojos;

import java.util.Date;

public class Registration {
	
	private long id;
	private String eventName;
	private String customerName;
	private Date date;
	private String notes;
	
	public Registration(long id, String customerName, String eventName, Date date, String notes) {
		this.id = id;
		this.customerName = customerName;
		this.eventName = eventName;
		this.date = date;
		this.notes = notes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
