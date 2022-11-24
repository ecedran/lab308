package com.ironhack.AssociationNurses.models;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('ACTIVE','LAPSED')")
    private MemberStatus memberStatus;

    public Member() {
    }

    public Member(String name, MemberStatus memberStatus) {
        setName(name);
        setMemberStatus(memberStatus);
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

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }
}
