package com.xiaoming.service;

import com.xiaoming.dao.EmployeeDao;
import com.xiaoming.domain.Employee;

public class LoginService {

	private EmployeeDao employeeDao;
	public EmployeeDao get() {
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao e) {
		this.employeeDao = e;
	}
	
	public boolean canLogin(String username, String password) {
		
		Employee e = employeeDao.findByName(username);
		if(e == null) {
			return false;
		}
		else if(!e.getPasswd().equals(password)) {
			return false;
		}
		return true;
	}
}
