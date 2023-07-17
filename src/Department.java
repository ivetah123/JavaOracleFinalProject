
public class Department {
	public Department(int depId, String depName) {
		super();
		this.depId = depId;
		this.depName = depName;
	}
	private int depId;
	private String depName;
	private Employee[] emps= new Employee[10];
	
	
	/***** START SETTERS AND GETTERS ******/
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	/***** FINISH SETTERS AND GETTERS ******/
	
	public String toString() {
		return ("Department ID: " + depId + ", department name: " + depName);
	}
	
	public void addEmp(Employee newEmp) {
		/*
		// assign the number of not null employees to count
		int count = 0;
		for (Employee emp1 : emps) {
			if (emp1 != null) count++;
		}*/
		//assign new employee newEmp to the first free position in the employee array emps[count]
		if (numEmps() < emps.length) {
			emps[numEmps()] = newEmp;
		}
	}
	
	public Employee[] allEmps() {
		/*
		// assign the number of not null employees to count
		int count = 0;
		for (Employee emp1 : emps) {
			if (emp1 != null) count++;
		}*/
		// create an array of the number of count employees (not null)
		Employee[] depEmps = new Employee[numEmps()];
		for (int i = 0; i<numEmps(); i++) {
			depEmps[i] = emps[i];
		}
		//return the array with not null employees
		return depEmps;
	}
	
	public int numEmps() {
		// assign the number of not null employees to count
		int count = 0;
		for (Employee emp : emps) {
			if (emp != null) count++;
		}
		return count;
	}
	
	public Employee findEmp(int id) {
		// search for employee with given id
		for (Employee emp : emps) {
			if (id == emp.getId()) return emp;
		} 
		return null;
	}
	public double depSalary() {
		//return total salary of the department
		double totalSalary = 0;
		for (Employee emp : allEmps()) {
			totalSalary += emp.getSalary();		}
		return totalSalary;
	}
	public double avSalary() {
		//return total salary of the department		
		try {
			return depSalary()/numEmps();		
		} catch (ArithmeticException e) {
			System.out.println("There are 0 employees in the department");
			return 0;
		}
		
	}
	
}
