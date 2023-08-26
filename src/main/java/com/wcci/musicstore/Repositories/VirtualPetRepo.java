package com.wcci.musicstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcci.musicstore.Models.VirtualPet;

public interface VirtualPetRepo extends JpaRepository<VirtualPet, Long> {
    
}
