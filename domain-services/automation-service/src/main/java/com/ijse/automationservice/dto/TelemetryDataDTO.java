package com.ijse.automationservice.dto;

import lombok.Data;

@Data
public class TelemetryDataDTO {
    private String zoneId;
    private Double temperature;

    public String getZoneId() { return this.zoneId; }
    public void setZoneId(String zoneId) { this.zoneId = zoneId; }

    public Double getTemperature() { return this.temperature; }
    public void setTemperature(Double temperature) { this.temperature = temperature; }
}

