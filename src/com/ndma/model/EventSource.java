package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "event_source")
public class EventSource implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_source_id")
    private Integer eventSourceId;

    @ManyToOne
    @JoinColumn(name = "event_id_fk")
    private DisasterEvent disasterEvent;

    @ManyToOne
    @JoinColumn(name = "source_id_fk")
    private DataSource dataSource;

	public Integer getEventSourceId() {
		return eventSourceId;
	}

	public void setEventSourceId(Integer eventSourceId) {
		this.eventSourceId = eventSourceId;
	}

	public DisasterEvent getDisasterEvent() {
		return disasterEvent;
	}

	public void setDisasterEvent(DisasterEvent disasterEvent) {
		this.disasterEvent = disasterEvent;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

    // Constructor, getters, and setters...
}
