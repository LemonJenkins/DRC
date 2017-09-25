package com.carsrace.DRC.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer raceId;

    @Column
    private String mark;

    @Column
    private String model;

    @Column
    private Integer horsePower;

    @Column
    private Double accelerationTo100;

    @Column
    private Integer maxSpeed;


    public Integer getId() {
        return raceId;
    }

    public void setId(Integer id) {
        this.raceId = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Double getAccelerationTo100() {
        return accelerationTo100;
    }

    public void setAccelerationTo100(Double accelerationTo100) {
        this.accelerationTo100 = accelerationTo100;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
