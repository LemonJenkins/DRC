package com.carsrace.DRC.Entity;

import javax.persistence.*;

@Entity
@Table
public class RaceParticipant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer raceParticipantId;

    @OneToOne
    private RegisteredUser registeredUser;

    @Column
    private Integer DrivingExpiriens;

    @ManyToOne
    @JoinColumn(name="carId", nullable=false)
    private Car car;

    @ManyToOne
    @JoinColumn(name="raceId", nullable=false)
    private Race race;

    @OneToOne
    private Rate rate;

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Integer getId() {
        return raceParticipantId;
    }

    public void setId(Integer id) {
        this.raceParticipantId = id;
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
