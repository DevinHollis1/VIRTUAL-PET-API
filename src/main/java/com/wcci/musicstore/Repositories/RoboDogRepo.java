package com.wcci.musicstore.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcci.musicstore.Models.RoboDog;

public interface RoboDogRepo extends JpaRepository<RoboDog, Long> {
    List<RoboDog> findByName(String name);
}

