package com.ijse.sensortelemetryservice.dto;

import lombok.Data;

@Data
public class TelemetryResponseDTO {
    private String deviceId;
    private String zoneId;
    private Double temperature;
    private String tempUnit;
    private Double humidity;
    private String humidityUnit;
    private String capturedAt;
}