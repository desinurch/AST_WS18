package Test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Project.Objects;
import Project.ProjectPart01;

public class test_ProjectPart01 {
	
	
 @Test
 public void test_0() {
	 
	 ProjectPart01 p1 =new ProjectPart01();
	 Objects[] result = new Objects[5];
	 Objects[] array1 = new Objects[5];
	 Objects[] array2 = new Objects[5];
	 array1[0] = new Objects("knife",1,"99%") ;
	 array1[1] = new Objects("scissor", 2, "65%") ;
     array1[2] = new Objects("spoon", 3, "33%") ;
	 array1[3] = new Objects("spoon", 4, "80%") ;
	 array1[4] = new Objects("keys", 5, "95%") ;
		
	 array2[0] = new Objects("knife",1,"55%") ;
	 array2[1] = new Objects("scissor", 2, "95%") ;
	 array2[2] = new Objects("fork", 3, "99%") ;
	 array2[3] = new Objects("spoon", 4, "99%") ;
	 array2[4] = new Objects("keys", 5, "95%") ;
	 
	 result= p1.ppart01(array1,array2);
	 
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
