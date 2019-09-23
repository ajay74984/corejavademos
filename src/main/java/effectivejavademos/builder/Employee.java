package effectivejavademos.builder;

public class Employee {
	private int id;
	private String name;
	private long salary;
	private String lastName;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	static class EmployeeBuilder {
		
		//required parameters
		private int id;
		private String name;
		
		//optional Parameters
		
		private long salary;
		private String lastName;
		
		
		public EmployeeBuilder(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public EmployeeBuilder withSalary(long salary) {
			this.salary = salary;
			return this;
		}
		
		public EmployeeBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
	}
	
	private Employee(EmployeeBuilder employeeBuilder) {
		id = employeeBuilder.id;
		name = employeeBuilder.name;
		salary = employeeBuilder.salary;
		lastName = employeeBuilder.lastName;
	}
}
