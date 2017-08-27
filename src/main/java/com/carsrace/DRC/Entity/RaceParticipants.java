package com.carsrace.DRC.Entity;

import javax.persistence.*;

@Entity
@Table
public class RaceParticipants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private RegisteredUsers registeredUser;

    @Column
    private Integer DrivingExpiriens;

    @Column
    private Cars car;

    @Column
    private Races race;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RegisteredUsers getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUsers registeredUser) {
        this.registeredUser = registeredUser;
    }

    public Integer getDrivingExpiriens() {
        return DrivingExpiriens;
    }

    public void setDrivingExpiriens(Integer drivingExpiriens) {
        DrivingExpiriens = drivingExpiriens;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }

    public Races getRace() {
        return race;
    }

    public void setRace(Races race) {
        this.race = race;
    }
}
