package com.carsrace.DRC.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Date checkinTime;

    @Column
    private RaceParticipant raceParticipantOne;

    @Column
    private RaceParticipant raceParticipantTwo;

    @Column
    private RaceParticipant winner;

    @Column
    private boolean RaceWasHeld;

    public boolean getRaceWasHeld() {
        return RaceWasHeld;
    }

    public void setRaceWasHeld(boolean raceWasHeld) {
        RaceWasHeld = raceWasHeld;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public RaceParticipant getRaceParticipantOne() {
        return raceParticipantOne;
    }

    public void setRaceParticipantOne(RaceParticipant raceParticipantOne) {
        this.raceParticipantOne = raceParticipantOne;
    }

    public RaceParticipant getRaceParticipantTwo() {
        return raceParticipantTwo;
    }

    public void setRaceParticipantTwo(RaceParticipant raceParticipantTwo) {
        this.raceParticipantTwo = raceParticipantTwo;
    }

    public RaceParticipant getWinner() {
        return winner;
    }

    public void setWinner(RaceParticipant winner) {
        this.winner = winner;
    }
}
