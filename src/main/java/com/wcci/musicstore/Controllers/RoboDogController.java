package com.wcci.musicstore.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wcci.musicstore.Models.RoboDog;
import com.wcci.musicstore.Repositories.RoboDogRepo;

@RestController
@RequestMapping("/robodog")
public class RoboDogController {
    @Autowired
    private RoboDogRepo robodogRepo;

    @GetMapping("/name/{name}")
    public List<RoboDog> getRoboDogByName(@PathVariable String name) {
        return robodogRepo.findByName(name);
    }
}

