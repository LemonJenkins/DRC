package com.carsrace.DRC.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer raceId;

    @Column
    private Date checkinTime;

    @OneToMany(mappedBy = "race")
    private List<RaceParticipant> raceParticipant;

    @Column
    private Integer winner;

    @Column
    private boolean raceWasHeld;

    @OneToOne
    private Rate rate;

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Integer getId() {
        return raceId;
    }

    public void setId(Integer id) {
        this.raceId = id;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public List<RaceParticipant> getRaceParticipant() {
        return raceParticipant;
    }

    public void setRaceParticipant(List<RaceParticipant> raceParticipant) {
        this.raceParticipant = raceParticipant;
    }

    public Integer getWinner() {
        return winner;
    }

    public void setWinner(Integer winner) {
        this.winner = winner;
    }

    public boolean isRaceWasHeld() {
        return raceWasHeld;
    }

    public void setRaceWasHeld(boolean raceWasHeld) {
        this.raceWasHeld = raceWasHeld;
    }
}
