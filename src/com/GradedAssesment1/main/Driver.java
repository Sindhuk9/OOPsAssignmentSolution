package com.GradedAssesment1.main;

import com.GradedAssesment1.Service.AdminDepartment;
import com.GradedAssesment1.Service.HrDepartment;
import com.GradedAssesment1.Service.TechDepartment;

public class Driver {

	public static void main(String args[]) {

		AdminDepartment AD = new AdminDepartment();
		System.out.println("Welcome to "+AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		HrDepartment HD = new HrDepartment();
		System.out.println('\n'+"Welcome to "+HD.departmentName());
		System.out.println(HD.doActivity());
		System.out.println(HD.getTodaysWork());
		System.out.println(HD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		TechDepartment TD = new TechDepartment();
		System.out.println('\n'+"Welcome to "+TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation());
		System.out.println(AD.isTodayAHoliday());
	}	
}
