package Project;

public class ProjectPart01 {
	
    public Objects[] ppart01(Objects[] array1,Objects[] array2){
        
    	Objects[] result = new Objects[5];
    	
    	for (int i=0 ; i<5; i++){
            
            if (array1[i].getObjectNumber() == array2[i].getObjectNumber()){
                
                int percentage1 = Integer.parseInt(array1[i].getObjectPercentage().replace("%", ""));
                int percentage2 = Integer.parseInt(array2[i].getObjectPercentage().replace("%", ""));
                
                result[i] = array1[i];
                
                if (percentage1 < percentage2){
                    
                    result[i] = array2[i];
                }             
            }
        }
    return result;
    }
    
public static void main(String[] args){
        
        Objects[] array1 = new Objects[5];
        Objects[] array2 = new Objects[5];
        Objects[] result = new Objects[5];
        
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
        ProjectPart01 p1 =new ProjectPart01();
        result= p1.ppart01(array1,array2);
        
        for (int i=0 ; i<5; i++)
        {
            System.out.println(result[i].getObjectNumber() + " " + result[i].getObjectNumber() + " " + result[i].getObjectPercentage());
        }
        
    }
        
        
}
