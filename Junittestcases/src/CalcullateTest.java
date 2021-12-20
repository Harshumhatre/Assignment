import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class CalcullateTest {
	Calcullate calculator;
@BeforeEach 
public void beforeA1()
{
System.out.println("Before Everything");	
}
	@BeforeEach
	void init() {
		calculator = new Calcullate();
		System.out.println("New Instance Method");
	}

	@AfterEach
	void aftercalculation() {
		System.out.println("Process Completed");
	}

	@Test
	@DisplayName("Addition1")
	
	void add() {
		Calcullate calcullate = new Calcullate();
		assertEquals(4, calcullate.add(2, 2));
	}

	@Test
	@DisplayName("Multiply1")
	void multiplication() {
		Calcullate calcullate = new Calcullate();
		assertEquals(4, calcullate.multiplication(2, 2));
	}

	@Test
	@DisplayName("Substration1")
	void substrction() {
		Calcullate calcullate = new Calcullate();
		assertEquals(3, calcullate.sustrction(5, 2));
	}
	@Test
	void division()
	{
		assertThrows(ArithmeticException.class,()->calculator.division(10, 5));
	}

}
