package Project;
import java.util.ArrayList;
import java.util.Arrays;

public class ProjectPart02 {   
	
	public ArrayList<Objects> ppart02(Objects[] array1,Objects[] array2){
		
	comparator a = new comparator();
    	ArrayList<Objects> result_array = new ArrayList<Objects>();	
    	result_array = a.Compare(array1,array2);    
    	Objects[] temp = result_array.toArray(new Objects[result_array.size()]);
    	Arrays.sort(temp, Objects::compareNum);
    	ArrayList<Objects> result = new ArrayList<Objects>(Arrays.asList(temp));
        return result;
	}
	
	public ArrayList<Objects> checkInput(ArrayList<Objects[]> data){
		ArrayList<Objects> data1 = new ArrayList<Objects>();
		ArrayList<Objects> result_array = new ArrayList<Objects>();	
		Objects[] temp = data.get(0);
		
		if (data.size() > 2) {
			for (int i=1; i<data.size()-1; i++) {
				data1 = this.ppart02(data.get(i), data.get(i+1));
				result_array = this.ppart02(temp, data1.toArray(new Objects[data1.size()]));
				temp = result_array.toArray(new Objects[result_array.size()]);
			}
		}
		else {
			result_array = this.ppart02(data.get(0), data.get(1));
		}
		return result_array;
	}
  
    
	public static void main(String[] args){
	
       
		Objects[] array1 = new Objects[2];
	    Objects[] array2 = new Objects[1];
	    Objects[] array3 = new Objects[1];
	    Objects[] array4 = new Objects[1];
	    ArrayList<Objects> result_array = new ArrayList<Objects>();
	    ArrayList<Objects[]> input_array = new ArrayList<Objects[]>();
	     
	    array1[0] = new Objects("knife",1,"89%") ;
	    array1[1] = new Objects("knife",1,"98%") ;
	    array2[0] = new Objects("knife",1,"35%") ;
	    array3[0] = new Objects("knife",1,"90%") ;
	    array4[0] = new Objects("knife",1,"80%") ;
	    
	    input_array.add(array1);
	    input_array.add(array2);
	    input_array.add(array3);
	    input_array.add(array4);
	            
	    ProjectPart02 p2 =new ProjectPart02();
	    System.out.println(input_array.get(0)[0].getObjectPercentage());
	    result_array = p2.checkInput(input_array);
        Objects[] result = result_array.toArray(new Objects[result_array.size()]);
        
        
        for (int i=0 ; i<result.length; i++)
        {
            System.out.println(result[i].getObjectName() + " " + result[i].getObjectNumber() + " " + result[i].getObjectPercentage());
        }
        
    }
        
        
}
