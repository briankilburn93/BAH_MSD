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
	private Long id;
	
	@Column(name="EVENT_ID")
	private String event_id;
	
	@Column(name="CUSTOMER_ID")
	private String customer_id;
	
	@Column(name="REGISTRATION_DATE")
	private Date registration_date;
	
	@Column(name="NOTES")
	private String notes;
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	
	public Registration(Long id, String customerId, String eventId, Date registration_date, String notes) {
		this.id = id;
		this.customer_id = customerId;
		this.event_id = eventId;
		this.registration_date = registration_date;
		this.notes = notes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public Date getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
