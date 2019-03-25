package com.capgemini.employe.model;

public class Employee {
	
	private int employeeId;
	private String employeename;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;
	
	public Employee() {
		super();
		
	}
	public Employee(int employeeId, String employeename, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.basicSalary = basicSalary;
		this.medical = medical;
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public double getEmployeeGrossSalary() {
		hra=(50*basicSalary)/100;
		grossSalary=basicSalary+hra+medical;
		return grossSalary;
		
	}
	public double getEmployeeNetSalary() {
		 pt=200;
		pf=(20*basicSalary)/100;
		netSalary=grossSalary-(pt+pf);
		return netSalary;
	}
	
	
	
	

}
