package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "responder_event")
public class ResponderEvent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "responder_event_id")
    private Integer responderEventId;

    @ManyToOne
    @JoinColumn(name = "responder_id_fk")
    private Responder responder;

    @ManyToOne
    @JoinColumn(name = "event_id_fk")
    private DisasterEvent disasterEvent;

	public Integer getResponderEventId() {
		return responderEventId;
	}

	public void setResponderEventId(Integer responderEventId) {
		this.responderEventId = responderEventId;
	}

	public Responder getResponder() {
		return responder;
	}

	public void setResponder(Responder responder) {
		this.responder = responder;
	}

	public DisasterEvent getDisasterEvent() {
		return disasterEvent;
	}

	public void setDisasterEvent(DisasterEvent disasterEvent) {
		this.disasterEvent = disasterEvent;
	}

    // Constructor, getters, and setters...
}
