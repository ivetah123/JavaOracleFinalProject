
public class HRApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("test");
		int searchId = 105;
		
		Department dep1 = new Department(1, "Legal Department");
		Employee emp1 = new Employee(101, "John Smith", 1, 2200);
		Employee emp2 = new Employee(102, "Ann Smith", 1, 2300);
		Employee emp3 = new Employee(103, "Bob Smith", 1, 1900);
		Employee emp4 = new Employee(104, "Manu Smith", 1, 1800);
		dep1.addEmp(emp1);
		dep1.addEmp(emp2);
		dep1.addEmp(emp3);
		dep1.addEmp(emp4);

		/********APPLICATION STARTING*********/
		System.out.println("Application is starting...");
		System.out.println("The department information is: " + dep1);
		Employee[] allEmps = dep1.allEmps();
		for (Employee emp : allEmps) {
			System.out.println("Employee " + emp);
		}
		
		System.out.println("No. of emps is: " + dep1.numEmps());

		try {
			System.out.println("Find employee with id = " + searchId + " : " + dep1.findEmp(searchId) );
		} catch (NullPointerException e){
			
			System.out.println("there is no such employee with the id: " + searchId);
		}
		System.out.println("Total salary of department id: " + dep1.getDepId() + 
				" with department name: " + dep1.getDepName() +" is: " + dep1.depSalary());
		System.out.println("Average salary is: " + dep1.avSalary());
	}
	
}
 