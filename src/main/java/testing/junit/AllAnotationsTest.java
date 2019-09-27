package testing.junit;

import org.junit.jupiter.api.*;

public class AllAnotationsTest {
	
	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll - executes once before all test methods in this class, I am Static");
	}
	
	@BeforeEach
	void init() {
		System.out.println("@BeforeEach - executes before each test method in this class");
	}
	
	@Test
	void basicTest() {
		System.out.println("I am a test");
	}
	
	@Test
	void basicTest2() {
		System.out.println("I am a test2");
	}
	
	@AfterAll
	static void clearup() {
		System.out.println("@AfterAll - executes once after all test methods in this class, I am static");
	}
	
	@AfterEach
	void tearDownEach() {
		System.out.println("@AfterEach - executes after each test method in this class");
	}
	
	@DisplayName("Single test successful")
	@Test
	void testSingleSuccessTest() {
		System.out.println("Success");
	}
	
	@Test
	@Disabled("Not implemented yet")
	void testShowSomething() {
		System.out.println("I am Ignored");
	}
	
	
	/*
	@AfterEach
	void tearDown() {
		System.out.println("@AfterEach - executed after each test method.");
	}
	
	@AfterAll
	static void done() {
		System.out.println("@AfterAll - executed after all test methods.");
	}
	
	@Test
	void lambdaExpressions() {
		Assertions.assertTrue(Stream.of(1, 2, 3)
				                      .mapToInt(i -> i)
				                      .sum() > 5, () -> "Sum should be greater than 5");
	}
	
	@Test
	void groupAssertions() {
		int[] numbers = {0, 1, 2, 3, 4};
		assertAll("numbers",
				() -> assertEquals(numbers[0], 1),
				() -> assertEquals(numbers[3], 3),
				() -> assertEquals(numbers[4], 1)
		);
	}
	
	@Test
	void trueAssumption() {
		assumeTrue(5 > 1);
		assertEquals(5 + 2, 7);
	}
	
	@Test
	void falseAssumption() {
		assumeFalse(5 < 1);
		assertEquals(5 + 2, 7);
	}
	
	@Test
	void assumptionThat() {
		String someString = "Just a string";
		assumingThat(
				someString.equals("Just a string"),
				() -> assertEquals(2 + 2, 4)
		);
	}
	
	@Test
	void shouldThrowException() {
		Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
			throw new UnsupportedOperationException("Not supported");
		});
		assertEquals(exception.getMessage(), "Not supported");
	}
	
	@Test
	void assertThrowsException() {
		String str = null;
		assertThrows(IllegalArgumentException.class, () -> {
			Integer.valueOf(str);
		});
	}*/
}
