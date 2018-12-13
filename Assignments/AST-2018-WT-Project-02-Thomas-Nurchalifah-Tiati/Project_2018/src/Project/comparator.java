package Project;

import java.util.ArrayList;

public class comparator {
	
	public ArrayList<Objects> Compare_self(Objects[] array){
		
		ArrayList<Objects> result = new ArrayList<Objects>();

		for (int i=0; i<array.length; i++){	
			
			if (array[i] != null){
				Objects temp = array[i];
				
				for (int j=array.length-1; j>i; j--){
					
					if (array[j] != null){
					
						if (temp.getObjectNumber() == array[j].getObjectNumber()){
						
							int percentage1 = Integer.parseInt(temp.getObjectPercentage().replace("%", ""));
							int percentage2 = Integer.parseInt(array[j].getObjectPercentage().replace("%", ""));
		                
		                	if (percentage1 < percentage2){
		                	
		                	    temp = array[j];	                    
		                	}		                
		                	array[j] = null;
						}
					}
				}
				result.add(temp);				
			}
			
		}
		
		return result;
	}
	
	
	
	
	public ArrayList<Objects> Compare(Objects[] array1,Objects[] array2){
		
		ArrayList<Objects> result_array = new ArrayList<Objects>();	
		ArrayList<Objects> arr1 = new ArrayList<Objects>();	
		ArrayList<Objects> arr2 = new ArrayList<Objects>();	
		arr1 = Compare_self(array1);
		arr2 = Compare_self(array2);
    	
    	if(arr1.size() == 0 && arr2.size() == 0){   		
    			result_array = arr1;
    		}
    	else if(arr1.size() == 0){    			
    			result_array = arr2;    			
    		}
    	else if(arr2.size() == 0){    		
    		    result_array = arr1;
    		}
    	else{   	
    			if (arr2.size() > arr1.size()){
    				ArrayList<Objects> temparr = new ArrayList<Objects>(); 
    				temparr = arr1 ;
    				arr1 = arr2;
    				arr2 = temparr;
    			}    			 			
        			
    			for (int i=0; i<arr1.size(); i++){	    			
    	  				
    					Objects temp = arr1.get(i);
    					
    					if (arr2.size() > 0){
    				
    					for (int j=0; j<arr2.size(); j++){
    					
    						if (temp.getObjectNumber() == arr2.get(j).getObjectNumber()){
    						
    							int percentage1 = Integer.parseInt(temp.getObjectPercentage().replace("%", ""));
    							int percentage2 = Integer.parseInt(arr2.get(j).getObjectPercentage().replace("%", ""));
    		                
    							if (percentage1 < percentage2){    		                	
    								temp = arr2.get(j);	                    
    							}
    							arr2.remove(j);
    						}				
 
    					}
    					
    				}
    					result_array.add(temp);				
    			}	
    			
    			if (arr2.size() > 0){    				
    				for (int i=0; i<arr2.size() ; i++){
    					result_array.add(arr2.get(i));
    				}
    			}
    			    		
    		}	

		return result_array;
	}

}
