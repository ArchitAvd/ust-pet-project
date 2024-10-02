package com.ust.airplane_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AirplaneEntity {

    @Id
    private long airplaneID;

    private String airplaneBrand;

    private String source;

    private String destination;

    private Date startTime;

    private Date endTime;


}
