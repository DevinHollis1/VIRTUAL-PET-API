package com.wcci.musicstore.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wcci.musicstore.Models.RoboCat; // Correct model import

public interface RoboCatRepo extends JpaRepository<RoboCat, Long> {
    List<RoboCat> findByName(String name);
}

