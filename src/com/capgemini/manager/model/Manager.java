package com.capgemini.manager.model;

import com.capgemini.employe.model.Employee;

public class Manager extends Employee {
	
	private double petrolAllowences;
	private double foodAllowences;
	private double otherAllowences;
	private double managertotalGrossSalary;
	private double managerTotalNetSalary;
	public Manager() {
		super();
	}

	public Manager(int employeeId, String employeename, double basicSalary, double medical) {
		super(employeeId, employeename, basicSalary, medical);
		
	}
	@Override
	public double getEmployeeGrossSalary() {
		petrolAllowences=(8*getBasicSalary())/100;
		foodAllowences=(13*getBasicSalary())/100;
		otherAllowences=(3*getBasicSalary())/100;
		managertotalGrossSalary=super.getEmployeeGrossSalary() + petrolAllowences+foodAllowences+otherAllowences;
		
		return managertotalGrossSalary;
		
	}
	public double getEmployeeNetSalary() {
		 double pt=200;
		double pf=(20*getBasicSalary())/100;
			managerTotalNetSalary=managertotalGrossSalary-(pt+pf);
		return managerTotalNetSalary;
	
		
		
	}
	

}
