package pr2;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee A = new Employee(831, "Moser", 2500, "FIBU");
		Employee B = new Employee(284, "Habib", 3000, "FIBU");
		Employee C = new Employee(564, "Pipik", 1000, "FIBU");
	

	Employee[] employees = new Employee[3];
	employees [0] = A;
	employees [1] = B;
	employees [2] = C;
	
	Arrays.sort(employees);
	
	for (Employee employee : employees) {
		
		System.out.println(employee);
	}
	
	}		
}
