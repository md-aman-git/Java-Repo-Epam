package com.epam.designpattern.facad;

import com.epam.designpattern.decorator.Canteen;
import com.epam.designpattern.decorator.VegCanteen;

public class HR {
	public void onBoardEployee(int role, String name) {
		Admin admin = new Admin();
		admin.createEmployee(role, name);
		
		Canteen vegCanteen = new VegCanteen();
		vegCanteen.addEmployee();
		
		ITDepratment department = new ITDepratment();
		department.addEmployeeAccount();
	}
}
