package com.example.employee.mapper;

import com.example.employee.dto.EmployeeDto;
import com.example.employee.entity.Employee;
// 🔹 Used in GET method
// Converts Employee (from DB) → EmployeeDto (to send as response)
public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    // 🔹 Used in POST method
    // Converts EmployeeDto (from request body) → Employee (to save in DB)
        public static Employee mapToEmployee(EmployeeDto employeeDto) {
            return new Employee(
                    employeeDto.getId(),
                    employeeDto.getFirstName(),
                    employeeDto.getLastName(),
                    employeeDto.getEmail()
            );
        }


    }

