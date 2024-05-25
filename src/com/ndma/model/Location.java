package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Integer locationId;
    private String coordinates;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<DisasterEvent> disasterEvents;

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public List<DisasterEvent> getDisasterEvents() {
		return disasterEvents;
	}

	public void setDisasterEvents(List<DisasterEvent> disasterEvents) {
		this.disasterEvents = disasterEvents;
	}

    // Constructor, getters, and setters...
}
