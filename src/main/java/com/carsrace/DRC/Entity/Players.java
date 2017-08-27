package com.carsrace.DRC.Entity;

import javax.persistence.*;

@Entity
@Table
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private RegisteredUsers registeredUser;

    @Column
    private Integer rate;

    @Column
    private Races race;

    @Column
    private RaceParticipants raceParticipant;

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

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Races getRace() {
        return race;
    }

    public void setRace(Races race) {
        this.race = race;
    }

    public RaceParticipants getRaceParticipant() {
        return raceParticipant;
    }

    public void setRaceParticipant(RaceParticipants raceParticipant) {
        this.raceParticipant = raceParticipant;
    }
}
