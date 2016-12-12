package com.xiaoming.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.xiaoming.domain.Employee;

public class EmployeeDao extends HibernateDaoSupport {

	public Employee get(Integer id) {
		return getHibernateTemplate().get(Employee.class, id);
	}
	
	public Integer save(Employee e) {
		return (Integer)getHibernateTemplate().save(e);
	}
	
	public void update(Employee employee) {
		getHibernateTemplate().update(employee);
	}
	
	public void delete(Employee employee) {
		getHibernateTemplate().delete(employee);
	}
	
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> findAll() {
		return (List<Employee>)getHibernateTemplate().find("from Employee");
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> findAllWithout(Integer id) {
		return (List<Employee>)getHibernateTemplate().find("from Employee p where p.id != ?", id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> findByNameAndPassword(String name, String pwd) {
		return (List<Employee>)getHibernateTemplate().find("from Employee p where p.name = ? and p.pass=?", name, pwd);
	}
	
	@SuppressWarnings("unchecked")
	public Employee findByName(String name) {
		List<Employee> emps = (List<Employee>)getHibernateTemplate().find("from Employee where name = ? " , name);
		if (emps!= null && emps.size() >= 1)
		{
			return emps.get(0);
		}
		return null;
	}
}
