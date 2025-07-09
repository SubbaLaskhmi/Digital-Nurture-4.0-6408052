package com.example;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdatajpaExampleApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringdatajpaExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee("John from Spring Data JPA");
        employeeService.addEmployee(emp);
    }
}
