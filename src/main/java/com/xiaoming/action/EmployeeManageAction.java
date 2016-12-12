package com.xiaoming.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaoming.domain.Employee;
import com.xiaoming.service.EmployeeManageService;

public class EmployeeManageAction extends ActionSupport {
	
	private static final long serialVersionUID = 47L;
	
	private EmployeeManageService empMagService;
	private List<EmployeeTV> employees;
	private String tip;
	private EmployeeTV etv;
	
	public EmployeeManageService getEmpMagService() {
		return empMagService;
	}

	public void setEmpMagService(EmployeeManageService empMagService) {
		this.empMagService = empMagService;
	}	

	public EmployeeTV getEtv() {
		return etv;
	}

	public void setEtv(EmployeeTV etv) {
		this.etv = etv;
	}

	public List<EmployeeTV> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeTV> employees) {
		this.employees = employees;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public List<EmployeeTV> employeeChange(List<Employee> e) {
		List<EmployeeTV> ee = new ArrayList<EmployeeTV>();
		for(int i=0; i<e.size(); i++) {
			Employee r = e.get(i);
			EmployeeTV t = new EmployeeTV(r.getId(), r.getName(), SystemConstant.titleIDToString(r.getTitle()), r.getAge(), r.getSex(), r.getPasswd());
			ee.add(t);
		}
		return ee;
	}

	public String execute() throws Exception {
		employees = employeeChange(empMagService.findAll());
		return SUCCESS;
	}
	
	public String update() throws Exception {
		try {
			if(etv.getId() == null || etv.getName() == null || etv.getTitle() == null 
					|| etv.getAge() == null | etv.getSex() == null || etv.getPasswd() == null
					|| !SystemConstant.isValidTitle(etv.getTitle())
					|| !SystemConstant.isValidSex(etv.getSex())) {
				tip = "Input error!";
				return ERROR;
			}
			Employee e = new Employee(etv.getId(), etv.getName(), SystemConstant.titleStringToID(etv.getTitle()), etv.getAge(), 
					etv.getSex(), etv.getPasswd());
			empMagService.update(e);
			return SUCCESS;
		}
		finally {
			execute();
		}
	}
	
	public String insert() throws Exception {
			if(etv.getId() == null || etv.getName() == null || etv.getTitle() == null 
					|| etv.getAge() == null | etv.getSex() == null || etv.getPasswd() == null
					|| !SystemConstant.isValidTitle(etv.getTitle())
					|| !SystemConstant.isValidSex(etv.getSex())) {
				tip = "Input error!";
				execute();
				return ERROR;
			}
			Employee e = new Employee(etv.getId(), etv.getName(), SystemConstant.titleStringToID(etv.getTitle()), etv.getAge(), 
					etv.getSex(), etv.getPasswd());
			empMagService.insert(e);
			employees = employeeChange(empMagService.findAllWithout(etv.getId()));
			employees.add(etv);
			return SUCCESS;

	}
	
	public String delete() throws Exception {
		try {
			if(etv.getId() == null || etv.getName() == null || etv.getTitle() == null 
					|| etv.getAge() == null | etv.getSex() == null || etv.getPasswd() == null
					|| !SystemConstant.isValidTitle(etv.getTitle())
					|| !SystemConstant.isValidSex(etv.getSex())) {
				tip = "Input error!";
				return ERROR;
			}
			empMagService.delete(etv.getId());
			return SUCCESS;
		}
		finally {			
			execute();
		}
	}
}

class EmployeeTV {

	private Integer id;
	private String name;
	private String title;
	private Integer age;
	private String sex;
	private String passwd;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public EmployeeTV() {
		
	}
	
	public EmployeeTV(int id, String name, String title, int age, String sex, String passwd) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.age = age;
		this.sex = sex;
		this.passwd = passwd;
	}
}
