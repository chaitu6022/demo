package com.scifdemo.demo.repository;

import com.scifdemo.demo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
