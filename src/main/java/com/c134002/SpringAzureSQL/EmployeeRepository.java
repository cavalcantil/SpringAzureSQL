package com.c134002.SpringAzureSQL;

import com.c134002.SpringAzureSQL.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
