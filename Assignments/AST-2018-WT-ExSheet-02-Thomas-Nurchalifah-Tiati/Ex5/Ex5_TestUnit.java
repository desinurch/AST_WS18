import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex5Test {
    
    Ex5 ex5 = new Ex5();
    
    @Test
    void testPrimeNum() {
        long[] result = ex5.found_prime_numbers("Integer");
        assertEquals(2, result[0]);
        assertEquals(2147483629, result[1]);
        
        result = ex5.found_prime_numbers("Long integer");
        assertEquals(2, result[0]);
        assertEquals(9223372036854775783L, result[1]);
    }
    
    @Test
    void testCountingTime() {
        double result1 = ex5.counting_time(0, 400);
        double result2 = ex5.counting_time(0, 800);
        double result3 = ex5.counting_time(0, 4000);
        double result = result2/result1;
        assertEquals(2, result, 1);
        result = result3/result1;
        assertEquals(10, result, 2);
    }

}
