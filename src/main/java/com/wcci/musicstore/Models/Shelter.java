package com.wcci.musicstore.Models;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;


    public Shelter() {
    }


    public Shelter( String name) {
        this.name = name;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //one shelter to one organic dogs
    @OneToMany(mappedBy = "shelter")
    private List<OrganicDog> organicDogs = new ArrayList<>();

    // many shelters to many employees
    @ManyToMany(mappedBy = "shelter")
    private List<Employee> employees = new ArrayList<>();


}
