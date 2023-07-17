
public class HRApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("test");
		int searchId = 105;
		
		/**********CREATE A DEPARTMENT************************/
		Department dep1 = new Department(1, "Legal Department");
		/**********CREATE THE EMPLOYEES************************/
		Employee emp1 = new Employee(101, "John Smith", 1, 2200);
		Employee emp2 = new Employee(102, "Ann Smith", 1, 2300);
		Employee emp3 = new Employee(103, "Bob Smith", 1, 1900);
		Employee emp4 = new Employee(104, "Manu Smith", 1, 1800);
		/**********ADD THE EMPLOYEES TO THE DEPARTMENT************************/
		dep1.addEmp(emp1);
		dep1.addEmp(emp2);
		dep1.addEmp(emp3);
		dep1.addEmp(emp4);
		dep1.addEmp(new Employee(105, "Manu Chao", 1, 2400));

		/********APPLICATION STARTING*********/
		System.out.println("Application is starting...");
		/***********DEPARTMENT INFO**************/
		System.out.println("The department information is: " + dep1);
		/**********GET FIELD OF ALL ACTUAL EMPLOYEES*********************/
		Employee[] allEmps = dep1.getActualEmps();
		/**********PRINT FIELD OF ALL ACTUAL EMPLOYEES*********************/
		for (Employee emp : allEmps) {
			System.out.println("Employee " + emp);
		}
		/**********PRINT NUMBER OF ALL ACTUAL EMPLOYEES*********************/
		System.out.println("No. of emps is: " + dep1.getNumActualEmps());
		/**********TRY LOOKING FOR EMPLOYEE BY ID*********************/
		//try {    /*testing inside method getEmpById(searchId)*/
		System.out.println("Find employee with id = " + searchId + " : " );
		System.out.println(dep1.getEmpById(searchId));  
		/*} catch (NullPointerException e){			
			System.out.println("there is no such employee with the id: " + searchId);
		}*/
		/**********PRINT TOTAL SALARY OF ALL ACTUAL EMPLOYEES OF THE DEPARTMENT*********************/
		System.out.println("Total salary of department id: " + dep1.getDepId() + 
				" with department name: " + dep1.getDepName() +" is: " + dep1.getTotalSalary());
		/**********PRINT AVERAGE SALARY OF THE DEPARTMENT*********************/
		System.out.println("Average salary is: " + dep1.getAvSalary());
	}
	
}
 