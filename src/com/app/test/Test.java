package com.app.test;

import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpId(55);
		e.setEmpName("Ajay");
		e.setEmpSal(567.87);
		
		System.out.println(e.getEmpId()+","+e.getEmpName()+","+e.getEmpSal());
	}
}
