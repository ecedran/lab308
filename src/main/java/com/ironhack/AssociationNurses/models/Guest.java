package com.ironhack.AssociationNurses.models;

import javax.persistence.*;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('ATTENDING','NOT_ATTENDING','NO_RESPONSE')")
    private GuestStatus guestStatus;

    public Guest() {
    }

    public Guest(String name, GuestStatus guestStatus) {
        setName(name);
        setGuestStatus(guestStatus);
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getGuestStatus() {
        return guestStatus;
    }

    public void setGuestStatus(GuestStatus guestStatus) {
        this.guestStatus = guestStatus;
    }
}
