package com.wcci.musicstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcci.musicstore.Models.OrganicDog;

import java.util.List;


public interface OrganicDogRepo extends JpaRepository<OrganicDog, Long> {
    List<OrganicDog> findByName(String name);
    
}
