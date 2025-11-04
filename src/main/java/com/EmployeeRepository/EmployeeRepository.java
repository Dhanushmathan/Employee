package com.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeEntity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
