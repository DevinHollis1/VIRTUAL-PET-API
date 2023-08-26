package com.wcci.musicstore.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wcci.musicstore.Models.RoboCat; // Correct import
import com.wcci.musicstore.Repositories.RoboCatRepo; // Correct import

@RestController
@RequestMapping("/robocat") // Correct request mapping
public class RoboCatController {
    @Autowired
    private RoboCatRepo robocatRepo; // Correct repository name

    @GetMapping("/name/{name}")
    public List<RoboCat> getRoboCatByName(@PathVariable String name) {
        return robocatRepo.findByName(name);
    }
}


