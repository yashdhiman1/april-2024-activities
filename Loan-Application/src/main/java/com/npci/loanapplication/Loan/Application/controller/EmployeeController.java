package com.npci.loanapplication.Loan.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.loanapplication.Loan.Application.dto.EmployeeLoginResponse;
import com.npci.loanapplication.Loan.Application.dto.LoginRequest;
import com.npci.loanapplication.Loan.Application.model.Employee;
import com.npci.loanapplication.Loan.Application.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity<String> registerEmployee(@RequestBody Employee employee) {
        try {
            employeeService.registerEmployee(employee);
            return ResponseEntity.status(HttpStatus.CREATED).body("Employee registered successfully");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<EmployeeLoginResponse> loginEmployee(@RequestBody LoginRequest request) {
        EmployeeLoginResponse response = employeeService.loginEmployee(request.getEmail(), request.getPassword());
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}