package com.wcci.musicstore.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrganicDog extends VirtualPet {

    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;
    private int mess;
    private int hygiene;
    private int sadness;
    private int thirst;
    private int hunger;
    private int health;

    public OrganicDog() {
    }

    public OrganicDog(String name, String description, boolean isAdopted, boolean isOrganic, int age) {
        super(name, description, isAdopted, isOrganic, age);
    }

    public Shelter getShelter() {
        return this.shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int getMess() {
        return this.mess;
    }

    public void setMess(int mess) {
        this.mess = mess;
    }

    public int getHygiene() {
        return this.hygiene;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getSadness() {
        return this.sadness;
    }

    public void setSadness(int sadness) {
        this.sadness = sadness;
    }


    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

