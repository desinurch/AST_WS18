import static org.junit.Assert.*;

import org.junit.Test;


public class Ex6_TestUnit {
	
	Ex6 ex = new Ex6();

	@Test
	public void testinput() {		
		int[] inputs = Ex6.inputs();
		int min = 1;
		int max = 1000000;
		boolean right_input1 = min <= inputs[0] && inputs[0] <= max;;
		boolean right_input2 = inputs[1]<inputs[2];
		assertTrue(right_input1);
		assertTrue(right_input2);
	}
	
	@Test
	public void testrandomarray() {
		int n = 8;
		double[] ArrayRandom = Ex6.random_numbers(n);		
		assertEquals(8, ArrayRandom.length);
	}
	
	@Test
	public void testsum() {
		double[] array = {1,2,3,4,5};
		double sum = Ex6.add(array);
		assertEquals(15, sum , 0);	
	}
	
	@Test
	public void testproduct() {
		double[] array = {1,2,3,4,5};
		double product = Ex6.multiply(array);
		assertEquals(120, product, 0);	
	}
	
	@Test
	public void testaverage() {
		double sum = 15;
		int n = 5;
		double average = Ex6.mean(sum,n);
		assertEquals(3, average , 0);	
	}
	
	@Test
	public void testvariance() {
		double[] array = {1,2,3,4,5};
		double mean = Ex6.mean(15, 5);
		double variance = Ex6.variance(array,mean);
		System.out.println(variance);
		assertEquals(1, variance , 0);	
	}
	
	@Test
	public void testminimum() {
		double[] array = {1,2,3,4,5};
		double minimum = Ex6.min(array);
        assertEquals(1, minimum ,0);	
	}
	
	@Test
	public void testmaximum() {
		double[] array = {1,2,3,4,5};
		double maximum = Ex6.max(array);
		assertEquals(5, maximum , 0);	
	}
	

}
