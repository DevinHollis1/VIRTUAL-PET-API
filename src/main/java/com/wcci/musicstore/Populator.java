package com.wcci.musicstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wcci.musicstore.Models.Employee;
import com.wcci.musicstore.Models.OrganicCat;
import com.wcci.musicstore.Models.OrganicDog;
import com.wcci.musicstore.Models.RoboCat;
import com.wcci.musicstore.Models.RoboDog;
import com.wcci.musicstore.Models.Shelter;
import com.wcci.musicstore.Repositories.EmployeeRepo;
import com.wcci.musicstore.Repositories.OrganicCatRepo;
import com.wcci.musicstore.Repositories.OrganicDogRepo;
import com.wcci.musicstore.Repositories.RoboCatRepo;
import com.wcci.musicstore.Repositories.RoboDogRepo;
import com.wcci.musicstore.Repositories.ShelterRepo;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private OrganicDogRepo organicDogRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ShelterRepo shelterRepo;

    @Autowired
    private OrganicCatRepo organicCatRepo;

    @Autowired
    private RoboDogRepo roboDogRepo;

    @Autowired
    private RoboCatRepo roboCatRepo;

    public Populator(OrganicDogRepo organicDogRepo2, RoboDogRepo roboDogRepo2, ShelterRepo shelterRepo2) {
    }

    @Override
    public void run(String... args) throws Exception {

        List<Shelter> shelters = new ArrayList<>();

        // Create and save the Shelter instances
        Shelter dogHouse = new Shelter("Dog House");
        Shelter petParadise = new Shelter("Pet Paradise");

        shelters.add(dogHouse);
        shelters.add(petParadise);

        shelterRepo.saveAll(shelters);

        // Retrieve the Shelter by index (0-based index)
        int targetIndex = 1; // Change this index to the desired value
        if (targetIndex >= 0 && targetIndex < shelters.size()) {
            Shelter targetShelter = shelters.get(targetIndex);

            // Create an OrganicDog instance and associate it with the target Shelter
            OrganicDog organicDog1 = new OrganicDog("Wyatt", "Deer Headed Chihuahua", false, true, 7);
            organicDog1.setShelter(targetShelter);
            organicDog1.setMess(10);
            organicDog1.setHygiene(20);
            organicDog1.setSadness(75);
            organicDog1.setHunger(50);
            organicDog1.setThirst(50);
            organicDog1.setHealth(80);
            organicDogRepo.save(organicDog1);

            OrganicCat organicCat1 = new OrganicCat("Snickers", "Tabby Cat", false, true, 10);
            organicCat1.setShelter(targetShelter);
            organicCat1.setMess(10);
            organicCat1.setHygiene(20);
            organicCat1.setSadness(75);
            organicCat1.setHunger(50);
            organicCat1.setThirst(50);
            organicCat1.setHealth(80);
            organicCatRepo.save(organicCat1);

            RoboDog roboDog1 = new RoboDog("Elon", "Robodog", true);
            roboDogRepo.save(roboDog1);

            RoboCat roboCat1 = new RoboCat("Java", "Robocat", true);
            roboCatRepo.save(roboCat1);

            Employee employee1 = new Employee("Devin");
            employee1.setShelter(targetShelter); // Associate the employee with the shelter
            employeeRepo.save(employee1);
        }
    }
}

