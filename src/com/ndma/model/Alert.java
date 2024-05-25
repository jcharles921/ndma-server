package com.ndma.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Alert implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alert_id")
    private Integer alertId;
    private String alertType;

    @ManyToOne
    @JoinColumn(name = "user_id_fk")
    private UserProfile user;

    @ManyToOne
    @JoinColumn(name = "disaster_type_id_fk")
    private DisasterType disasterType;

	public Integer getAlertId() {
		return alertId;
	}

	public void setAlertId(Integer alertId) {
		this.alertId = alertId;
	}

	public String getAlertType() {
		return alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public UserProfile getUser() {
		return user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

	public DisasterType getDisasterType() {
		return disasterType;
	}

	public void setDisasterType(DisasterType disasterType) {
		this.disasterType = disasterType;
	}

    // Constructor, getters, and setters...
    
}
