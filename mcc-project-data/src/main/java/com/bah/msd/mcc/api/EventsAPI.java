package com.bah.msd.mcc.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.mcc.pojos.Event;

@RestController
@RequestMapping("/events")
public class EventsAPI {
	
	@GetMapping
	public List<Event> getAllEvents() {
		List<Event> eventList = new ArrayList<Event>();
		
		Event singleEvent = new Event();
		singleEvent.setEventCode("test eventCode");
		singleEvent.setEventDescription("test eventDescription");
		singleEvent.setEventTitle("test eventTitle");
		singleEvent.setId(2);
		
		eventList.add(singleEvent);
		
		return eventList;
	}
	
	@GetMapping("/{id}")
	public Event getEventById(@PathVariable("id") int id) {
		
		Event singleEvent = new Event();
		singleEvent.setEventCode("test eventCode");
		singleEvent.setEventDescription("test eventDescription");
		singleEvent.setEventTitle("test eventTitle");
		singleEvent.setId(2);
		
		if(singleEvent.getId() == id) {
			return singleEvent;
		} else {
			return null;
		}
		
	}
	
	

}
