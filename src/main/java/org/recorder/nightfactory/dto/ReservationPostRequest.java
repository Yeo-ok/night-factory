package org.recorder.nightfactory.dto;

import lombok.Getter;
import lombok.Setter;
import org.recorder.nightfactory.domain.Schedule;

import java.time.LocalDateTime;
import java.util.Date;


public class ReservationPostRequest {
    private int scheduleId;
    private Date reservationDate;
    private String owner;
    private String phoneNumber;
    private int numberOfPeople;
    private LocalDateTime reservationAt;

    public int getScheduleId() {
        return scheduleId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public String getOwner() {
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public LocalDateTime getReservationAt() {
        return reservationAt;
    }
}
