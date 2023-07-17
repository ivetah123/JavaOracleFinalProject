
public class Employee {
	
	public Employee(int id, String name, int depId, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.depId = depId;
		this.salary = salary;
	}
	private int id;
	private String name;
	private int depId;
	private double salary;
	
	/***** START SETTERS AND GETTERS ******/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getdepId() {
		return depId;
	}
	public void setDep_id(int depId) {
		this.depId = depId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/***** FINISH SETTERS AND GETTERS ******/
	
	public String toString() {
		return ("id: " + id + ", name: " + name + ", depId: " + depId + ", salary: " + salary);
	}
	
}
