package com.wcci.musicstore.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.musicstore.Models.OrganicDog;
import com.wcci.musicstore.Repositories.OrganicDogRepo;

@RestController
@RequestMapping("/organicdog") // Update the request mapping
public class OrganicDogController {
    @Autowired
    private OrganicDogRepo organicDogRepo;

    @GetMapping("/name/{name}")
    public List<OrganicDog> getOrganicDogByName(@PathVariable String name) {
        return organicDogRepo.findByName(name);
    }
}
