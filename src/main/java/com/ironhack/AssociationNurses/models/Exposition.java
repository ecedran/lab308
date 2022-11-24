package com.ironhack.AssociationNurses.models;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Exposition extends Event{

    public Exposition() {
    }

    public Exposition(Date date, int durationMin, String location, String title, List<Guest> guests) {
        super(date, durationMin, location, title, guests);
    }
}
