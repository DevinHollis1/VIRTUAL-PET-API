package com.wcci.musicstore.Repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wcci.musicstore.Models.Shelter;

public interface ShelterRepo extends JpaRepository<Shelter, Long> {
    List<Shelter> findByName(String name);
}
