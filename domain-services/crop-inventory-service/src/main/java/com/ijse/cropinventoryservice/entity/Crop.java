package com.ijse.cropinventoryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "crops")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Crop {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String cropType;
    private String zoneId;
    private LocalDate plantDate;

    @Enumerated(EnumType.STRING)
    private CropState state;

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getCropType() { return this.cropType; }
    public void setCropType(String cropType) { this.cropType = cropType; }

    public String getZoneId() { return this.zoneId; }
    public void setZoneId(String zoneId) { this.zoneId = zoneId; }

    public java.time.LocalDate getPlantDate() { return this.plantDate; }
    public void setPlantDate(java.time.LocalDate plantDate) { this.plantDate = plantDate; }

    public CropState getState() { return this.state; }
    public void setState(CropState state) { this.state = state; }
}