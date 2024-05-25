package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Report implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Integer reportId;
    private String content;

    @ManyToOne
    @JoinColumn(name = "event_id_fk")
    private DisasterEvent disasterEvent;

	public Integer getReportId() {
		return reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public DisasterEvent getDisasterEvent() {
		return disasterEvent;
	}

	public void setDisasterEvent(DisasterEvent disasterEvent) {
		this.disasterEvent = disasterEvent;
	}

    // Constructor, getters, and setters...
}
