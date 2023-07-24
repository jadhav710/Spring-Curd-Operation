package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.EmployeeDao;
import com.rt.entity.Employee;

@Service

public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	public boolean register(Employee e){
		return empDao.register(e);
		
	}
	public boolean update(Employee e){
		return empDao.update(e);
	}
	public Employee selectEmployeeById(int id){
		return empDao.selectEmployeeById(id);
		
	}
	public List<Employee> selectAllEmployees(){
		return empDao.selectAllEmployees();
	}
	

}
