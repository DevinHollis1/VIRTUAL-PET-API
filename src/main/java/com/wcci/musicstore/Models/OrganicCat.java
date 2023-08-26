package com.wcci.musicstore.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrganicCat extends VirtualPet {

    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;
    private int mess;
    private int hygiene;
    private int sadness;
    private int hunger;
    private int health;
    private int thirst;

    public OrganicCat() {
    }

    public OrganicCat(String name, String description, boolean isAdopted, boolean isOrganic, int age) {
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

    public int getSadness() {
        return this.sadness;
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

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }


    public void setSadness(int sadness) {
        this.sadness = sadness;
    }

    public void setShelterIndex(int i) {
    }


}
