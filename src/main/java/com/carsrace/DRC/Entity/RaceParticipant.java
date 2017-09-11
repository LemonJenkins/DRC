package com.carsrace.DRC.Entity;

import javax.persistence.*;

@Entity
@Table
public class RaceParticipant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private RegisteredUser registeredUser;

    @Column
    private Integer DrivingExpiriens;

    @Column
    private Car car;

    @Column
    private Race race;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }

    public Integer getDrivingExpiriens() {
        return DrivingExpiriens;
    }

    public void setDrivingExpiriens(Integer drivingExpiriens) {
        DrivingExpiriens = drivingExpiriens;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
