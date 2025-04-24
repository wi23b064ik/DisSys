package com.example.energyAPI.controller;

import com.example.energyAPI.dto.currentEnergyDTO;
import com.example.energyAPI.dto.historicalEnergyDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/energy")
public class EnergyController {

    @GetMapping("/current")
    public currentEnergyDTO getCurrentEnergy() {
        return new currentEnergyDTO("78.54%", "7.23%");
    }

    @GetMapping("/historical")
    public List<historicalEnergyDTO> getHistoricalData(
            @RequestParam("start") String start,
            @RequestParam("end") String end) {

        return List.of(
                new historicalEnergyDTO(
                        LocalDateTime.parse("2025-01-10T14:00:00"),
                        143.024,
                        130.101,
                        14.75
                )
        );
    }
}
