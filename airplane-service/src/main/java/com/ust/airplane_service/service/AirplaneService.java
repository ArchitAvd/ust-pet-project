package com.ust.airplane_service.service;

import com.ust.airplane_service.dao.AirplaneDao;
import com.ust.airplane_service.entity.AirplaneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService {

    @Autowired
    private AirplaneDao airplaneDao;

    public AirplaneEntity addAirplane(AirplaneEntity airplaneEntity){
        return airplaneDao.saveAndFlush(airplaneEntity);
    }

    public AirplaneEntity updateAirplane(AirplaneEntity airplaneEntity){
        return airplaneDao.saveAndFlush(airplaneEntity);
    }

    public void deleteAirplane(long airplaneID){
        airplaneDao.deleteById(airplaneID);
    }

    public AirplaneEntity getAAirplane(long airplaneID){
        return airplaneDao.findById(airplaneID).orElseThrow();
    }

    public List<AirplaneEntity> getAllAirplane(){
        return airplaneDao.findAll();
    }

}
