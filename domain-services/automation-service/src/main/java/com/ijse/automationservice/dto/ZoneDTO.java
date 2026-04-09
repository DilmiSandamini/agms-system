package com.ijse.automationservice.dto;

import lombok.Data;

@Data
public class ZoneDTO {
    private String id;
    private Double minTemp;
    private Double maxTemp;

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public double getMinTemp() { return this.minTemp; }
    public void setMinTemp(double minTemp) { this.minTemp = minTemp; }

    public double getMaxTemp() { return this.maxTemp; }
    public void setMaxTemp(double maxTemp) { this.maxTemp = maxTemp; }
}