package com.ijse.automationservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "action_logs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String zoneId;
    private Double recordedTemperature;
    private String actionTaken; // "TURN_FAN_ON" or "TURN_HEATER_ON"
    private LocalDateTime timestamp;

    public void setZoneId(String zoneId) { this.zoneId = zoneId; }

    public void setRecordedTemperature(double recordedTemperature) { this.recordedTemperature = recordedTemperature; }

    public void setActionTaken(String actionTaken) { this.actionTaken = actionTaken; }

    public void setTimestamp(java.time.LocalDateTime timestamp) { this.timestamp = timestamp; }
}