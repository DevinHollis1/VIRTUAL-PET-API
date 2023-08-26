package com.wcci.musicstore.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wcci.musicstore.Models.OrganicCat;
import com.wcci.musicstore.Repositories.OrganicCatRepo;

@RestController
@RequestMapping("/organiccat")
public class OrganicCatController {
    @Autowired
    private OrganicCatRepo organicCatRepo;

    @GetMapping("/name/{name}")
    public List<OrganicCat> getOrganicCatByName(@PathVariable String name) {
        return organicCatRepo.findByName(name);
    }
}

