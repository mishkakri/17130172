import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositCalculatorTest {

	@Test
	void testDeposit() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(35000.0 , 11.0, 3);
		assertEquals(46550, result);
	}
	
	@Test
	void testDeposit1() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(16000.0 , 5.0, 3);
		assertEquals(18400, result);
	}
	
}
