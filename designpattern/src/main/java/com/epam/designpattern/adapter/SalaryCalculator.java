package com.epam.designpattern.adapter;

public class SalaryCalculator extends LeaveDetails implements IEmployee {

	@Override
	public void readNoticeBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getSalary() {
		int salaryToReduce = 100 *(getTotalLeaves() - getAvaillableLeaves());
		return (getSalary() - salaryToReduce);
	}

	@Override
	public void setSalary(float salary) {
		// TODO Auto-generated method stub
		
	}
	
	
}
