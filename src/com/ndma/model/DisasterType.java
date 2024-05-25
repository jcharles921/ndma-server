package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class DisasterType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disaster_type_id")
    private Integer disasterTypeId;
    private String name;

    @OneToMany(mappedBy = "disasterType", cascade = CascadeType.ALL)
    private List<Alert> alerts;

    @OneToMany(mappedBy = "disasterType", cascade = CascadeType.ALL)
    private List<DisasterEvent> disasterEvents;

	public Integer getDisasterTypeId() {
		return disasterTypeId;
	}

	public void setDisasterTypeId(Integer disasterTypeId) {
		this.disasterTypeId = disasterTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Alert> getAlerts() {
		return alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}

	public List<DisasterEvent> getDisasterEvents() {
		return disasterEvents;
	}

	public void setDisasterEvents(List<DisasterEvent> disasterEvents) {
		this.disasterEvents = disasterEvents;
	}

    // Constructor, getters, and setters...
}
