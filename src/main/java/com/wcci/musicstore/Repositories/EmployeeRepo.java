package com.wcci.musicstore.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcci.musicstore.Models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
}
