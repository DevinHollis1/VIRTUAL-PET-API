package com.wcci.musicstore.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.musicstore.Models.VirtualPet;
import com.wcci.musicstore.Repositories.VirtualPetRepo;

@RestController
@RequestMapping("/superartist")
public class SuperVirtualPetController {
    @Autowired
    private VirtualPetRepo virtualPetRepo;

    @GetMapping("/{id}")
    public VirtualPet getSuperVirtualPetById(@PathVariable long id) {
        return virtualPetRepo.findById(id).orElse(null);
    }
}

