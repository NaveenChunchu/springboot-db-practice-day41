package com.jobiak.mvcforms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empdata")
public class Employee {
	
	@Id
	private Long emp_id;
	private String emp_name;
	private Long emp_mobile;
	private String emp_city;
	private Long emp_sal;
	
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Long getEmp_mobile() {
		return emp_mobile;
	}
	public void setEmp_mobile(Long emp_mobile) {
		this.emp_mobile = emp_mobile;
	}
	public String getEmp_city() {
		return emp_city;
	}
	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}
	public Long getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(Long emp_sal) {
		this.emp_sal = emp_sal;
	}
	
	
	
	

}
