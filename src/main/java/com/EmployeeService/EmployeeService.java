package com.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeDao.EmployeeDao;
import com.EmployeeEntity.EmployeeEntity;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public String postEmp(EmployeeEntity e) {
		return ed.postEmp(e);
	}

	public String postAllEmp(List<EmployeeEntity> a) {
		return ed.postAllEmp(a);
	}

	public List<EmployeeEntity> getAllEmp() {
		return ed.getAllEmp();
	}

	public String getDeleteById(int b) {
		return ed.getDeleteById(b);
	}

	public String getUpdateById(EmployeeEntity c, int d) {
		return ed.getUpdateById(c, d);
	}

	public String getUpdateSigById(EmployeeEntity f, int e) {
		return ed.getUpdateSigById(f, e);
	}

	public EmployeeEntity getEmpById(int h) {
		return ed.getEmpById(h);
	}
	
}
