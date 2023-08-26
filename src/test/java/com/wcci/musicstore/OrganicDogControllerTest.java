package com.wcci.musicstore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.wcci.musicstore.Controllers.OrganicDogController;
import com.wcci.musicstore.Models.OrganicDog;
import com.wcci.musicstore.Repositories.OrganicDogRepo;

@SpringBootTest
public class OrganicDogControllerTest {

    @InjectMocks
    private OrganicDogController organicDogController;

    @Mock
    private OrganicDogRepo organicDogRepo;

    @Test
    public void testGetOrganicDogByName() {
        OrganicDog mockDog = new OrganicDog("Wyatt", "Deer Headed Chihuahua", false, true, 7);
        List<OrganicDog> mockDogs = new ArrayList<>();
        mockDogs.add(mockDog);
        when(organicDogRepo.findByName("Wyatt")).thenReturn(mockDogs);

        List<OrganicDog> results = organicDogController.getOrganicDogByName("Wyatt");

        assertEquals(1, results.size(), "Should return one OrganicDog");
        assertEquals("Wyatt", results.get(0).getName(), "OrganicDog name should match");
    }

    @Test
    public void testGetOrganicDogByName_NoMatchingDog() {
        when(organicDogRepo.findByName("Nonexistent Dog")).thenReturn(new ArrayList<>());

        List<OrganicDog> results = organicDogController.getOrganicDogByName("Nonexistent Dog");

        assertEquals(0, results.size(), "Should not return any OrganicDog");
    }
}


