package com.ust.airplane_service.dao;

import com.ust.airplane_service.entity.AirplaneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneDao extends JpaRepository<AirplaneEntity,Long> {
}
