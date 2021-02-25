package com.bah.msd.mcc.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGISTRATIONS")
public class Registration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="EVENT_ID")
	private int eventId;
	
	@Column(name="CUSTOMER_ID")
	private int customerId;
	
	@Column(name="REGISTRATION_DATE")
	private Date date;
	
	@Column(name="NOTES")
	private String notes;
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	
	public Registration(long id, int customerId, int eventId, Date date, String notes) {
		this.id = id;
		this.customerId = customerId;
		this.eventId = eventId;
		this.date = date;
		this.notes = notes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
