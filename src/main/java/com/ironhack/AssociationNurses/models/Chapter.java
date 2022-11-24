package com.ironhack.AssociationNurses.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "id")
    private Member president;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Member> members;

    public Chapter(String name, String district, Member president, List<Member> members) {
        setName(name);
        setDistrict(district);
        setPresident(president);
        setMembers(members);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
