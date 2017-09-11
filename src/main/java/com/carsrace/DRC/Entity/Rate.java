package com.carsrace.DRC.Entity;

import javax.persistence.*;

@Entity
@Table
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private RegisteredUser registeredUser;

    @Column
    private Integer rate;

    @Column
    private Race race;

    @Column
    private RaceParticipant raceParticipant;

    @Column
    private Boolean win;

    public Boolean getWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

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

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public RaceParticipant getRaceParticipant() {
        return raceParticipant;
    }

    public void setRaceParticipant(RaceParticipant raceParticipant) {
        this.raceParticipant = raceParticipant;
    }
}
