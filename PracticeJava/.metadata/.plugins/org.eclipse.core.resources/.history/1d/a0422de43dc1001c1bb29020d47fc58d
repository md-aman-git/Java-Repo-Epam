package com.epam.practicecodes.stream;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util.ArrayList;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = getEmployeeList();
		Map<String, Long> map = list.stream().collect(Collectors
				.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Map : " + map);
		
		Set<String> namesDpt = list.stream().map(Employee::getDepartment).collect(Collectors.toSet());
		System.out.println("All names of department : " + namesDpt);
		
		Map<String, Double> avgAge = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingLong(Employee::getAge)));
		System.out.println("Average age of gender : " + avgAge);
		
		Optional<Employee> emp = list.stream().max((a, b) -> (int) (a.getSalary() - b.getSalary()));
		if(emp.isPresent()) {
			System.out.println("Max Salary Emp : " + emp.get());
		}
		
		List<String> joinedAfter2015 = list.stream().filter(p -> p.getYearOfJoining() > 2015).map(Employee::getName).toList();
		System.out.println("Joined after 2015 : " + joinedAfter2015);
		
		Map<String, Long> countEmpByDept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Count of emp in each dept : " + countEmpByDept);
		
		Map<String, Double> avgSalEmpByDept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Agv of emp in each dept : " + avgSalEmpByDept);
		
		Optional<Employee> empYoung = list.stream().filter(p -> p.getDepartment().equalsIgnoreCase("Product Development")).min((a, b) -> a.getAge() - b.getAge());
		if(empYoung.isPresent()) {
			System.out.println("Young emp from product dev : " + empYoung.get());
		}
		
		double averageSalary = list.stream().map(Employee::getSalary).collect(Collectors.averagingDouble(a -> a));
		System.out.println("Salary average : " + averageSalary);
		
		LocalDateTime ldt = LocalDateTime.now();
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		ZoneOffset offset = zone.getRules().getOffset(ldt);
		Instant instant = ldt.toInstant(offset);
		Date date = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("Date : " + date);
		
		LocalDateTime ldt2 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(ldt2);
	}
	
	private static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		return employeeList;
	}
}
