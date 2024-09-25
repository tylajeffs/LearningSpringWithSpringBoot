package com.tylajeffs.lil.learning_spring.data;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="RESERVATION_ID")
    private long reservationId;
    @Column(name="GUEST_ID")
    private long guestId;
    @Column(name="ROOM_ID")
    private long roomId;
    @Column(name="RES_DATE")
    private Date reservationDate;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getDate() {
        return reservationDate;
    }

    public void setDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", guestId=" + guestId +
                ", roomId=" + roomId +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
