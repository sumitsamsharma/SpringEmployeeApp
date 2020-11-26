package com.cg.employeepayrollapp.controller;



//import org.springframework.*;

import com.cg.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

   @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get Call Success ", HttpStatus.OK);
    }
    @GetMapping("/get{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable(value = "empId") int empId) {
        return new ResponseEntity<String>("Get Call Success for Id: " + empId, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<String>("Created Employee Payroll Data for: " + employeePayrollDTO.toString(), HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<String>("Updated Employee Payroll Data for: " + employeePayrollDTO.toString(), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Delete Call success for id: " + empId, HttpStatus.OK);
    }

}



