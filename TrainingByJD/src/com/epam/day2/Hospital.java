package com.epam.day2;

import com.epam.day2.HospitalManagement.department;

public interface Hospital {
	Patient register();
	department allocateDept(String illness);
	boolean feePaid(String paid);
}
