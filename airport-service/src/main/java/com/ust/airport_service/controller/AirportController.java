package com.ust.airport_service.controller;

import com.ust.airport_service.entity.AirportEntity;
import com.ust.airport_service.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @PostMapping("/airports")
    public AirportEntity addAirport(@RequestBody AirportEntity airportEntity){
        return airportService.addAirport(airportEntity);
    }

    @PutMapping("/airports")
    public AirportEntity updateAirport(@RequestBody AirportEntity airportEntity){
        return airportService.updateAirport(airportEntity);
    }

    @DeleteMapping("/airports/{airportId}")
    public void deleteAirport(@PathVariable("airportId") long airportId){
        airportService.deleteAirport(airportId);
    }

    @GetMapping("/airports/{airportId}")
    public AirportEntity getAAirport(@PathVariable("airportId") long airportId){
        return airportService.getAAirport(airportId);
    }

    @GetMapping("/airports")
    public List<AirportEntity> getAllAirports(){
        return airportService.getAllAirport();
    }

}
