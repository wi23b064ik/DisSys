package com.example.energyAPI.dto;

public class currentEnergyDTO {
    public String communityPoolUsed;
    public String gridPortion;

    public currentEnergyDTO(String communityPoolUsed, String gridPortion) {
        this.communityPoolUsed = communityPoolUsed;
        this.gridPortion = gridPortion;
    }
}
