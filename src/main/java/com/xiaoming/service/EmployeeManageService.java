package com.xiaoming.service;

import java.util.List;

import com.xiaoming.dao.EmployeeDao;
import com.xiaoming.domain.Employee;

public class EmployeeManageService {
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> findAll() {
		List<Employee> e = employeeDao.findAll();
		return e;
	}
	
	public List<Employee> findAllWithout(Integer id) {
		List<Employee> e = employeeDao.findAllWithout(id);
		return e;
	}
	
	public int update(Employee e) {
		employeeDao.update(e);
		return 0;
	}
	
	public Integer insert(Employee e) {
		return employeeDao.save(e);
	}
	
	public void delete(Integer id) {
		employeeDao.delete(id);
	}
}
