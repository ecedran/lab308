package com.ironhack.AssociationNurses.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private int durationMin;
    private String location;
    private String title;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Guest> guests;


    public Event() {
    }

    public Event(Date date, int durationMin, String location, String title, List<Guest> guests) {
        setDate(date);
        setDurationMin(durationMin);
        setLocation(location);
        setTitle(title);
        setGuests(guests);
    }

    public int getId() {
        return id;
    }

        public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
