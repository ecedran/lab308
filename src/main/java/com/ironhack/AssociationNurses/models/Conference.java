package com.ironhack.AssociationNurses.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Conference extends Event{

    @OneToMany
    @JoinColumn(name = "id")
    private List<Speaker> speakers;


    public Conference() {
    }

    public Conference(Date date, int durationMin, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(date, durationMin, location, title, guests);
        setSpeakers(speakers);
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
