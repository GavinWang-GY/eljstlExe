package com.inooc.employee;

/**
 * Employee员工类
 * @author Administrator
 *
 */
public class Employee {
	private Integer empno;
	private String ename;
	private String department;
	private String job;
	private Float salary;
	// 自动生成一个构造方法，用于数据初始化
	public Employee(Integer empno, String ename, String department, String job, Float salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.department = department;
		this.job = job;
		this.salary = salary;
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	

}
