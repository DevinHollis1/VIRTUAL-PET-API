package com.wcci.musicstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wcci.musicstore.Models.OrganicCat;
import java.util.List;

public interface OrganicCatRepo extends JpaRepository<OrganicCat, Long> {
    List<OrganicCat> findByName(String name);
}

