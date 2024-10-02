package com.ust.airport_service.dao;

import com.ust.airport_service.entity.AirportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportDao extends JpaRepository<AirportEntity,Long> {
}
