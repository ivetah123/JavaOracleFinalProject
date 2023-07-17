
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
		if (getNumActualEmps() < emps.length) {
			emps[getNumActualEmps()] = newEmp;
		}
	}
	
	public Employee[] getActualEmps() {
		/*
		// assign the number of not null employees to count
		int count = 0;
		for (Employee emp1 : emps) {
			if (emp1 != null) count++;
		}*/
		// create an array of the number of count employees (not null)
		Employee[] actualEmps = new Employee[getNumActualEmps()];
		for (int i = 0; i<getNumActualEmps(); i++) {
			actualEmps[i] = emps[i];
		}
		//return the array with not null employees
		return actualEmps;
	}
	
	public int getNumActualEmps() {
		// assign the number of not null employees to count
		int count = 0;
		for (Employee emp : emps) {
			if (emp != null) count++;
		}
		return count;
	}
	
	public Employee getEmpById(int searchId) {
		// search for employee with given id
			for (Employee emp : getActualEmps()) {
				if (searchId == emp.getId()) return emp;
			} 
			System.out.println("there is no such employee with the id: " + searchId);
			return null;	
	}
	public double getTotalSalary() {
		//return total salary of the department
		double totalSalary = 0;
		for (Employee emp : getActualEmps()) {
			totalSalary += emp.getSalary();		}
		return totalSalary;
	}
	public double getAvSalary() {
		//return total salary of the department		
		try {
			return getTotalSalary()/getNumActualEmps();		
		} catch (ArithmeticException e) {
			System.out.println("There are 0 employees in the department");
			return 0;
		}
		
	}
	
}
