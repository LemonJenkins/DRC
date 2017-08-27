package com.carsrace.DRC.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Races {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Date checkinTime;

    @Column
    private RaceParticipants raceParticipantOne;

    @Column
    private RaceParticipants raceParticipantTwo;

    @Column
    private RaceParticipants winner;

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

    public RaceParticipants getRaceParticipantOne() {
        return raceParticipantOne;
    }

    public void setRaceParticipantOne(RaceParticipants raceParticipantOne) {
        this.raceParticipantOne = raceParticipantOne;
    }

    public RaceParticipants getRaceParticipantTwo() {
        return raceParticipantTwo;
    }

    public void setRaceParticipantTwo(RaceParticipants raceParticipantTwo) {
        this.raceParticipantTwo = raceParticipantTwo;
    }

    public RaceParticipants getWinner() {
        return winner;
    }

    public void setWinner(RaceParticipants winner) {
        this.winner = winner;
    }
}
