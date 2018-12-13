package Test;

import static org.junit.Assert.*;

import Project.Objects;
import Project.ProjectPart02;
import java.util.ArrayList;

import org.junit.Test;

public class test_ProjectPart02 {

	@Test
	 public void test_0() {
	     
	     ProjectPart02 p2 =new ProjectPart02();
	     Objects[] array1 = new Objects[5];
	     Objects[] array2 = new Objects[5];
	     ArrayList<Objects> result_array = new ArrayList<Objects>();
	     
	     array1[0] = new Objects("knife",1,"94%") ;
	     array1[1] = new Objects("scissor", 2, "65%") ;
	     array1[2] = new Objects("spoon", 3, "33%") ;
	     array1[3] = new Objects("spoon", 4, "80%") ;
	     array1[4] = new Objects("keys", 5, "95%") ;
       
	     array2[0] = new Objects("keys",5,"95%") ;
	     array2[1] = new Objects("spoon", 4, "99%") ;
	     array2[2] = new Objects("fork", 3, "99%") ;
	     array2[3] = new Objects("scissor", 2, "95%") ;
	     array2[4] = new Objects("knife",1,"55%") ; 
	     
	     result_array = p2.ppart02(array1,array2);
	     Objects[] result = result_array.toArray(new Objects[result_array.size()]); 
	     
	     assertEquals("knife", result[0].getObjectName());
	     assertEquals(1, result[0].getObjectNumber());
	     assertEquals("94%", result[0].getObjectPercentage());
	     
	     assertEquals("scissor", result[1].getObjectName());
	     assertEquals(2, result[1].getObjectNumber());
	     assertEquals("95%", result[1].getObjectPercentage());
	     
	     assertEquals("fork", result[2].getObjectName());
	     assertEquals(3, result[2].getObjectNumber());
	     assertEquals("99%", result[2].getObjectPercentage());
	     
	     assertEquals("spoon", result[3].getObjectName());
	     assertEquals(4, result[3].getObjectNumber());
	     assertEquals("99%", result[3].getObjectPercentage());
	     
	     assertEquals("keys", result[4].getObjectName());
	     assertEquals(5, result[4].getObjectNumber());
	     assertEquals("95%", result[4].getObjectPercentage());
	    
	   }
	 
	 @Test
	 public void test_1() {
	     
	     ProjectPart02 p2 =new ProjectPart02();
	     Objects[] array1 = new Objects[0];
	     Objects[] array2 = new Objects[0];
	     ArrayList<Objects> result_array = new ArrayList<Objects>(); 
	     
	     
	     result_array = p2.ppart02(array1,array2);
     
	     assertEquals(0, result_array.size());
	   
	    
	   }
	 
	 @Test
	 public void test_2() {
	     
	     ProjectPart02 p2 =new ProjectPart02();
	     Objects[] array1 = new Objects[3];
	     Objects[] array2 = new Objects[0];
	     ArrayList<Objects> result_array = new ArrayList<Objects>(); 
	     
	     array1[0] = new Objects("knife",1,"99%") ;
	     array1[1] = new Objects("scissor", 2, "65%") ;
	     array1[2] = new Objects("spoon", 3, "33%") ;
	     
	     result_array = p2.ppart02(array1,array2);
	     Objects[] result = result_array.toArray(new Objects[result_array.size()]); 
	     
	     assertEquals("knife", result[0].getObjectName());
	     assertEquals(1, result[0].getObjectNumber());
	     assertEquals("99%", result[0].getObjectPercentage());
	     
	     assertEquals("scissor", result[1].getObjectName());
	     assertEquals(2, result[1].getObjectNumber());
	     assertEquals("65%", result[1].getObjectPercentage());
	     
	     assertEquals("spoon", result[2].getObjectName());
	     assertEquals(3, result[2].getObjectNumber());
	     assertEquals("33%", result[2].getObjectPercentage());
	    
	    
	   }
	 
	 @Test
	 public void test_3() {
	     
	     ProjectPart02 p2 =new ProjectPart02();
	     Objects[] array1 = new Objects[3];
	     Objects[] array2 = new Objects[3];
	     ArrayList<Objects> result_array = new ArrayList<Objects>(); 
	     
	     array1[0] = new Objects("knife",1,"99%") ;
	     array1[1] = new Objects("scissor", 2, "65%") ;
	     array1[2] = new Objects("spoon", 3, "33%") ;
	     
	     array2[0] = new Objects("KNIFE",1,"99%") ;
	     array2[1] = new Objects("SCISSOR", 2, "65%") ;
	     array2[2] = new Objects("SPOON", 3, "33%") ;
	     
	     result_array = p2.ppart02(array1,array2);
	     Objects[] result = result_array.toArray(new Objects[result_array.size()]); 
	     
	     assertEquals("knife", result[0].getObjectName());
	     assertEquals(1, result[0].getObjectNumber());
	     assertEquals("99%", result[0].getObjectPercentage());
	     
	     assertEquals("scissor", result[1].getObjectName());
	     assertEquals(2, result[1].getObjectNumber());
	     assertEquals("65%", result[1].getObjectPercentage());
	     
	     assertEquals("spoon", result[2].getObjectName());
	     assertEquals(3, result[2].getObjectNumber());
	     assertEquals("33%", result[2].getObjectPercentage());
	    
	    
	   }
	 
	 @Test
	 public void test_4() {
	     
	     ProjectPart02 p2 =new ProjectPart02();
	     Objects[] array1 = new Objects[2];
	     Objects[] array2 = new Objects[2];
	     ArrayList<Objects> result_array = new ArrayList<Objects>(); 
	     
	     array1[0] = new Objects("knife",1,"99%") ;
	     array1[1] = new Objects("scissor", 2, "65%") ;
	     
	     array2[0] = new Objects("fork",3,"99%") ;
	     array2[1] = new Objects("spoon", 4, "99%") ;
	     
	     result_array = p2.ppart02(array1,array2);
	     Objects[] result = result_array.toArray(new Objects[result_array.size()]); 
	     
	     assertEquals("knife", result[0].getObjectName());
	     assertEquals(1, result[0].getObjectNumber());
	     assertEquals("99%", result[0].getObjectPercentage());
	     
	     assertEquals("scissor", result[1].getObjectName());
	     assertEquals(2, result[1].getObjectNumber());
	     assertEquals("65%", result[1].getObjectPercentage());
	     
	     assertEquals("fork", result[2].getObjectName());
	     assertEquals(3, result[2].getObjectNumber());
	     assertEquals("99%", result[2].getObjectPercentage());
	    
	     assertEquals("spoon", result[3].getObjectName());
	     assertEquals(4, result[3].getObjectNumber());
	     assertEquals("99%", result[3].getObjectPercentage());
	    
	   }
	 
	 @Test
	 public void test_5() {
	     
	     ProjectPart02 p2 =new ProjectPart02();
	     Objects[] array1 = new Objects[3];
	     Objects[] array2 = new Objects[2];
	     ArrayList<Objects> result_array = new ArrayList<Objects>(); 
	     
	     array1[0] = new Objects("knife",1,"94%") ;
	     array1[1] = new Objects("knife", 1, "69%") ;
	     array1[1] = new Objects("knife", 1, "89%") ;
	     
	     array2[0] = new Objects("knife",1,"99%") ;
	     array2[1] = new Objects("fork", 3, "99%") ;
	     
	     result_array = p2.ppart02(array1,array2);
	     Objects[] result = result_array.toArray(new Objects[result_array.size()]); 
	     
	     assertEquals("knife", result[0].getObjectName());
	     assertEquals(1, result[0].getObjectNumber());
	     assertEquals("99%", result[0].getObjectPercentage());
	     
	     assertEquals("fork", result[1].getObjectName());
	     assertEquals(3, result[1].getObjectNumber());
	     assertEquals("99%", result[1].getObjectPercentage());
	    	    
	   }
	 
	 @Test
	 public void test_6() {
	     
		 ProjectPart02 p2 =new ProjectPart02();
		    Objects[] array1 = new Objects[1];
		    Objects[] array2 = new Objects[1];
		    Objects[] array3 = new Objects[1];
		    Objects[] array4 = new Objects[1];
		    ArrayList<Objects> result_array = new ArrayList<Objects>();
		    ArrayList<Objects[]> input_array = new ArrayList<Objects[]>();
		     
		    array1[0] = new Objects("knife",1,"89%") ;
		    array2[0] = new Objects("knife",1,"35%") ;
		    array3[0] = new Objects("knife",1,"69%") ;
		    array4[0] = new Objects("knife",1,"80%") ;
		    
		    input_array.add(array1);
		    input_array.add(array2);
		    input_array.add(array3);
		    input_array.add(array4);
		     
		    result_array = p2.checkInput(input_array);
	        Objects[] result = result_array.toArray(new Objects[result_array.size()]); 
		     
		    assertEquals("knife", result[0].getObjectName());
		    assertEquals(1, result[0].getObjectNumber());
		    assertEquals("89%", result[0].getObjectPercentage());
		    	    	    
	   }
	 
	 @Test
	 public void test_7() {
	     
		 	ProjectPart02 p2 =new ProjectPart02();
		    Objects[] array1 = new Objects[5];
		    Objects[] array2 = new Objects[5];
		    Objects[] array3 = new Objects[5];
		    Objects[] array4 = new Objects[5];
		    ArrayList<Objects> result_array = new ArrayList<Objects>();
		    ArrayList<Objects[]> input_array = new ArrayList<Objects[]>();
		     
		    array1[0] = new Objects("knife",1,"94%") ;
		    array1[1] = new Objects("scissor", 2, "65%") ;
		    array1[2] = new Objects("spoon", 3, "33%") ;
		    array1[3] = new Objects("spoon", 4, "80%") ;
		    array1[4] = new Objects("keys", 5, "95%") ;
	       
		    array2[0] = new Objects("keys",5,"95%") ;
		    array2[1] = new Objects("spoon", 4, "99%") ;
		    array2[2] = new Objects("fork", 3, "99%") ;
		    array2[3] = new Objects("scissor", 2, "95%") ;
		    array2[4] = new Objects("knife",1,"55%") ; 
		    
		    array3[0] = new Objects("knife",1,"99%") ;
		    array3[1] = new Objects("fork", 3, "99%") ;
		    
		    array4[0] = new Objects("knife",1,"94%") ;
		    array4[1] = new Objects("knife", 1, "69%") ;
		    array4[1] = new Objects("knife", 1, "89%") ;
		         
		    input_array.add(array1);
		    input_array.add(array2);
		    input_array.add(array3);
		    input_array.add(array4);
		     
		    result_array = p2.checkInput(input_array);
	        Objects[] result = result_array.toArray(new Objects[result_array.size()]); 
		     
		    assertEquals("knife", result[0].getObjectName());
		    assertEquals(1, result[0].getObjectNumber());
		    assertEquals("99%", result[0].getObjectPercentage());
		    
		    assertEquals("scissor", result[1].getObjectName());
		    assertEquals(2, result[1].getObjectNumber());
		    assertEquals("95%", result[1].getObjectPercentage());
		    
		    assertEquals("fork", result[2].getObjectName());
		    assertEquals(3, result[2].getObjectNumber());
		    assertEquals("99%", result[2].getObjectPercentage());
		    
		    assertEquals("spoon", result[3].getObjectName());
		    assertEquals(4, result[3].getObjectNumber());
		    assertEquals("99%", result[3].getObjectPercentage());
		    
		    assertEquals("keys", result[4].getObjectName());
		    assertEquals(5, result[4].getObjectNumber());
		    assertEquals("95%", result[4].getObjectPercentage());
		    	    	    
	   }
	 
	 
}
