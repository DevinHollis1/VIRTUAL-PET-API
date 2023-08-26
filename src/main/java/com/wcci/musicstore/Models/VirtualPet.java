package com.wcci.musicstore.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class VirtualPet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    protected String name;
    protected String description;
    protected boolean isAdopted;
    protected boolean isOrganic;
    protected int age;

    public VirtualPet() {
    }

    public VirtualPet(String name, String description, boolean isAdopted, boolean isOrganic, int age) {
        this.name = name;
        this.description = description;
        this.isAdopted = isAdopted;
        this.isOrganic = isOrganic;
        this.age = age;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public boolean isIsAdopted() {
        return this.isAdopted;
    }

    public boolean getIsAdopted() {
        return this.isAdopted;
    }

    public void setIsAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }
    


    public boolean isIsOrganic() {
        return this.isOrganic;
    }

    public boolean getIsOrganic() {
        return this.isOrganic;
    }

    public void setIsOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }
    

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

