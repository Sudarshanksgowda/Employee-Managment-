package com.example.employee.services;

import com.example.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeServices {
    EmployeeDto createsEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployee(Long employeeId);

    List<EmployeeDto> getAllEmployees();
  EmployeeDto updateEmployee( Long employeeId, EmployeeDto updateEmployee);
  void deleteEmployee(Long employeeId);
}
