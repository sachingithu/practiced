package com.demo.entity;

public class Employee {

	private String ename;
	private String eadd;
	private Double esal;
	private Company company;
	public Employee(String ename, String eadd, Double esal,Company company) {
		super();
		this.ename = ename;
		this.eadd = eadd;
		this.esal = esal;
		this.company=company;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eadd=" + eadd + ", esal=" + esal + ", company=" + company + "]";
	}
	
}
