package com.ust.airport_service.service;

import com.ust.airport_service.dao.AirportDao;
import com.ust.airport_service.entity.AirportEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    private AirportDao airportDao;

    public AirportEntity addAirport(AirportEntity airportEntity){
        return airportDao.saveAndFlush(airportEntity);
    }

    public AirportEntity updateAirport(AirportEntity airportEntity){
        return airportDao.saveAndFlush(airportEntity);
    }

    public void deleteAirport(long airportId){
        airportDao.deleteById(airportId);
    }

    public AirportEntity getAAirport(long airportId){
        return airportDao.findById(airportId).orElseThrow();
    }

    public List<AirportEntity> getAllAirport(){
        return airportDao.findAll();
    }


}
