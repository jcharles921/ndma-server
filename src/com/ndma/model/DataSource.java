package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class DataSource implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "source_id")
    private Integer sourceId;
    private String sourceType;

    @ManyToMany(mappedBy = "dataSources")
    private List<DisasterEvent> disasterEvents;

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public List<DisasterEvent> getDisasterEvents() {
		return disasterEvents;
	}

	public void setDisasterEvents(List<DisasterEvent> disasterEvents) {
		this.disasterEvents = disasterEvents;
	}

    // Constructor, getters, and setters...
}
