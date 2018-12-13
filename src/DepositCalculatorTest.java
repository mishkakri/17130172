import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositCalculatorTest {

	@Test
	void testDeposit() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(30000.0 , 10.0, 1);
		assertEquals(33000, result);
	}
	
	@Test
	void testDeposit1() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(15000.0 , 4.0, 1);
		assertEquals(15600, result);
	}
	
}
