package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class DisasterEvent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Integer eventId;
    private String description;

    @ManyToOne
    @JoinColumn(name = "disaster_type_id_fk")
    private DisasterType disasterType;

    @ManyToOne
    @JoinColumn(name = "location_id_fk")
    private Location location;

    @OneToMany(mappedBy = "disasterEvent", cascade = CascadeType.ALL)
    private List<Report> reports;

    @ManyToMany
    @JoinTable(
        name = "responder_event",
        joinColumns = @JoinColumn(name = "event_id_fk"),
        inverseJoinColumns = @JoinColumn(name = "responder_id_fk")
    )
    private List<Responder> responders;

    @ManyToMany
    @JoinTable(
        name = "event_source",
        joinColumns = @JoinColumn(name = "event_id_fk"),
        inverseJoinColumns = @JoinColumn(name = "source_id_fk")
    )
    private List<DataSource> dataSources;

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DisasterType getDisasterType() {
		return disasterType;
	}

	public void setDisasterType(DisasterType disasterType) {
		this.disasterType = disasterType;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public List<Responder> getResponders() {
		return responders;
	}

	public void setResponders(List<Responder> responders) {
		this.responders = responders;
	}

	public List<DataSource> getDataSources() {
		return dataSources;
	}

	public void setDataSources(List<DataSource> dataSources) {
		this.dataSources = dataSources;
	}

    // Constructor, getters, and setters...
}
