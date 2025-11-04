package com.EmployeeDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.EmployeeEntity.EmployeeEntity;
import com.EmployeeRepository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public String postEmp(EmployeeEntity e) {
		er.save(e);
		return "Saved Sucessfully";
	}

	public String postAllEmp(List<EmployeeEntity> a) {
		er.saveAll(a);
		return "Save All Sucessfully";
	}

	public List<EmployeeEntity> getAllEmp() {
		return er.findAll();

	}
	
	public EmployeeEntity getEmpById(int h) {
		return er.findById(h).orElseThrow(() -> new RuntimeException("Result not found for ID: " + h));
	}

	public String getDeleteById(int b) {
		er.deleteById(b);
		return "Delete Succesfully";
	}

	public String getUpdateById(EmployeeEntity c, int d) {
		EmployeeEntity x = er.findById(d).get();
		x.setName(c.getName());
		x.setSalary(c.getSalary());
		er.save(x);
		return "Updated Successfully";
	}

	public String getUpdateSigById(EmployeeEntity f, int e) {
		EmployeeEntity x = er.findById(e).get();
		x.setName(f.getName());
		er.save(x);
		return "Single Value Updated";
	}
}
