package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Responder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "responder_id")
    private Integer responderId;
    private String name;

    @ManyToMany(mappedBy = "responders")
    private List<DisasterEvent> disasterEvents;

	public Integer getResponderId() {
		return responderId;
	}

	public void setResponderId(Integer responderId) {
		this.responderId = responderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DisasterEvent> getDisasterEvents() {
		return disasterEvents;
	}

	public void setDisasterEvents(List<DisasterEvent> disasterEvents) {
		this.disasterEvents = disasterEvents;
	}

    // Constructor, getters, and setters...
}
