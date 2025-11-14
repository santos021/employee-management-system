package com.skb.controller;

import com.skb.entity.Employee;
import com.skb.service.EmployeeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee){
		System.out.println("Received employee data: " + employee);
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/all-employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
		try{
			employeeService.deleteEmployee(id);
			return new ResponseEntity<>("Employee with ID " + id + " deleted successfully", HttpStatus.OK);
		} catch (EntityNotFoundException e){
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Long id){
		Employee employee = employeeService.getEmployeeById(id);
		if (employee == null) return ResponseEntity.notFound().build();
		return ResponseEntity.ok(employee);
	}

	@PatchMapping("/employee/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		Employee updateEmployee = employeeService.updateEmployee(id, employee);

		if (updateEmployee == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		return ResponseEntity.ok(updateEmployee);
	}
}
