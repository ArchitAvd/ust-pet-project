package com.ust.airplane_service.controller;

import com.ust.airplane_service.entity.AirplaneEntity;
import com.ust.airplane_service.service.AirplaneService;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AirplaneController {

    @Autowired
    private AirplaneService airplaneService;

    @PostMapping("/airplanes")
    public AirplaneEntity addAirplane(@RequestBody AirplaneEntity airplaneEntity){
        return airplaneService.addAirplane(airplaneEntity);
    }

    @PutMapping("/airplanes")
    public AirplaneEntity updateAirplane(@RequestBody AirplaneEntity airplaneEntity){
        return airplaneService.updateAirplane(airplaneEntity);
    }

    @DeleteMapping("/airplanes/{airplaneId}")
    public void deleteAirplane(@PathVariable("airplaneId") long airplaneId){
        airplaneService.deleteAirplane(airplaneId);
    }

    @GetMapping("/airplanes/{airplaneId}")
    public AirplaneEntity getAAirplane(@PathVariable("airplaneId") long airplaneId){
        return airplaneService.getAAirplane(airplaneId);
    }

    @GetMapping("/airplanes")
    public List<AirplaneEntity> getAllAirplanes(){
        return airplaneService.getAllAirplane();
    }


}
