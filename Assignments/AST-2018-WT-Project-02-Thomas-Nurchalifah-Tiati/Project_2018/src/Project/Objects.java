package Project;

public class Objects {
    
    private String ObjectName;
    private int ObjectNumber;
    private String ObjectPercentage;
    
    public Objects(String ObjectName , int ObjectNumber , String ObjectPercentage ){
        
        this.ObjectName            = ObjectName ;
        this.ObjectNumber        = ObjectNumber ;
        this.ObjectPercentage    = ObjectPercentage ;}

	public int getObjectNumber() {
		
		return ObjectNumber ;
	}

	public String getObjectPercentage() {
		
		return ObjectPercentage;
	}
	public String getObjectName() {
		
		return ObjectName ;
	}

	public void setObjectNumber(int temp) {
		// TODO Auto-generated method stub
		ObjectNumber =temp; 
	}
	
	public static int compareNum(Objects array1, Objects array2) {
		return Integer.compare(array1.ObjectNumber,array2.ObjectNumber);
	}

}