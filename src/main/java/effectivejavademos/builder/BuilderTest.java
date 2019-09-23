package effectivejavademos.builder;

import effectivejavademos.builder.Employee.EmployeeBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderTest {
	
	public static void main(String[] args) {
	
	}
	
	@org.junit.Test
	public void testBuilder() {
		Employee employee = new EmployeeBuilder(123, "Ajay")
				                    .withSalary(100)
				                    .withLastName("Garg")
				                    .build();
		assertThat(employee.getLastName()).isEqualTo("Garg");
	}
}
