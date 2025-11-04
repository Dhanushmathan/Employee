package com.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.EmployeeEntity.EmployeeEntity;
import com.EmployeeService.EmployeeService;

@RestController
@RequestMapping(value = "/emp/api")
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@PostMapping(value = "/postSingleEmp")
	public String postEmp(@RequestBody EmployeeEntity e) {
		return es.postEmp(e);
	}
	
	@PostMapping(value = "/postAllEmp")
	public String postAllEmp(@RequestBody List<EmployeeEntity> a) {
		return es.postAllEmp(a);
	}
	
	@GetMapping(value = "/getAllEmp")
	public List<EmployeeEntity> getAllEmp(){
		return es.getAllEmp();
	}
	
	@GetMapping(value = "/getEmpbyId/{h}")
	public EmployeeEntity getEmpById(@PathVariable int h) {
		return es.getEmpById(h);
	}
	
	@DeleteMapping(value = "/deleteById/{b}")
	public String getDeleteById(@PathVariable int b) {
		return es.getDeleteById(b);
	}
	
	@PutMapping(value = "/getUpdate/{d}")
	public String getUpdateById(@RequestBody EmployeeEntity c, @PathVariable int d) {
		return es.getUpdateById(c, d);
	}
	
	@PatchMapping(value = "/getSingleUpdate/{e}")
	public String getUpdateSigById(@RequestBody EmployeeEntity f, @PathVariable int e) {
		return es.getUpdateSigById(f, e);
	}
	
}
