package com.csb.samplefullstack.controller;

import com.csb.samplefullstack.entity.Employee;
import com.csb.samplefullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/employee")
@CrossOrigin("*") //allow all connections
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/employees")
    public Employee getEmployeeById(@PathVariable Long id) {

        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees/{id}")
        public Employee getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById.get();
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/employees/{id}")
    public Employee deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}


