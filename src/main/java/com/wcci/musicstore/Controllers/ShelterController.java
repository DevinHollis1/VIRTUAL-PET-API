package com.wcci.musicstore.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.musicstore.Models.Shelter;
import com.wcci.musicstore.Repositories.ShelterRepo;

@RestController
@RequestMapping("/shelter")
public class ShelterController {
    @Autowired
    private ShelterRepo shelterRepo;

    // This is for testing purposes
    @GetMapping("/{id}")
    public Shelter getShelterById(@PathVariable long id) {
        return shelterRepo.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<Shelter> getShelterByName(@PathVariable String name) {
        return shelterRepo.findByName(name);
    }
}


