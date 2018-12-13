import static org.junit.jupiter.api.Assertions.*;
import junit.runner.Version;

import org.junit.jupiter.api.Test;

class Ex7Test {

	Ex7 ex7 = new Ex7();
	
	@Test
	void testFunction() {
		double result = ex7.f(10, 20);
		assertEquals(0.001369f, result, 0.00001f);
		
		result = ex7.f(100, 120);
		assertEquals(1.0, result);
		
		result = ex7.f(1000, 1200);
		assertEquals(1.0, result);
		
		result = ex7.f(10000, 10200);
		assertEquals(1.0, result);
		
		//Testing optimized code
		
		result = ex7.f1(10,20);
		assertEquals(0.001369f, result, 0.00001f);
		
		result = ex7.f1(100, 120);
		assertEquals(1.0, result);

		result = ex7.f1(1000, 1200);
		assertEquals(1.0, result);

		result = ex7.f1(10000, 10200);
		assertEquals(1.0, result);

		result = ex7.f1(100000,1020000000);
		assertEquals(1.0, result);
		
	}

}
