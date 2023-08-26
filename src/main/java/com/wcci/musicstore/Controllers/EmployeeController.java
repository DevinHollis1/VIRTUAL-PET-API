package com.wcci.musicstore.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.musicstore.Models.Employee;
import com.wcci.musicstore.Repositories.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/new")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

    @GetMapping("/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        return employeeRepo.findByName(name);
    }
}
