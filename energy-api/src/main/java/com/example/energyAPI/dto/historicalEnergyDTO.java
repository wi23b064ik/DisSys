package com.example.energyAPI.dto;

import java.time.LocalDateTime;

public class historicalEnergyDTO {
    public LocalDateTime hour;
    public double communityProduced;
    public double communityUsed;
    public double gridUsed;

    public historicalEnergyDTO(LocalDateTime hour, double produced, double used, double gridUsed) {
        this.hour = hour;
        this.communityProduced = produced;
        this.communityUsed = used;
        this.gridUsed = gridUsed;
    }
}
