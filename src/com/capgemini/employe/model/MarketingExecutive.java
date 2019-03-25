package com.capgemini.employe.model;

public class MarketingExecutive extends Employee{
	
	private double employeeTravelledKilometers;
	private double employeeTourAllowences;
	private double employeeTelephoneAllowences;
	private double marketingExecutiveGrossSalary;
	private double marketingExecutiveNetSalary;

	
	public MarketingExecutive() {
		super();
		
	}

	public MarketingExecutive(int employeeId, String employeename, double basicSalary, double medical,double employeeTravelledKilometers) {
		super(employeeId, employeename, basicSalary, medical);
		this.employeeTravelledKilometers=employeeTravelledKilometers;
	}

	public double getEmployeeTravelledKilometers() {
		return employeeTravelledKilometers;
	}

	public void setEmployeeTravelledKilometers(double employeeTravelledKilometers) {
		this.employeeTravelledKilometers = employeeTravelledKilometers;
	}
	@Override
	public double getEmployeeGrossSalary() {
		employeeTourAllowences= getEmployeeTravelledKilometers()*5;
		employeeTelephoneAllowences=1500;
		
		marketingExecutiveGrossSalary=super.getEmployeeGrossSalary()+employeeTourAllowences+employeeTelephoneAllowences;
		return marketingExecutiveGrossSalary;
		
	}
	public double getEmployeeNetSalary() {
		double  pt=200;
		double pf=(20*getBasicSalary())/100;
		marketingExecutiveNetSalary=getEmployeeGrossSalary()-(pf+pt);
		return marketingExecutiveNetSalary;
	}

	

}
