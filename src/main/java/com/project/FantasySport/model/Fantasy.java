package com.project.FantasySport.model;

import java.time.LocalDate;
import java.util.UUID;

public class Fantasy {
    private UUID id;
    private String name;
    private String position;
    private String team;
    private LocalDate dob;

    public Fantasy() {
    }


    //constructor with the object
    public Fantasy(UUID id, String name, String position, String team, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.team = team;
        this.dob = dob;
    }

    //constructor without the id
    public Fantasy(String name, String position, String team, LocalDate dob) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.dob = dob;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Fantasy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", team='" + team + '\'' +
                ", dob=" + dob +
                '}';
    }
}
