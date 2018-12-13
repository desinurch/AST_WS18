package Project;

public class Objects {
    
    private String ObjectName;
    private int ObjectNumber;
    private String ObjectPercentage;
    
    public Objects(String ObjectName , int ObjectNumber , String ObjectPercentage ){
        
        this.ObjectName            = ObjectName ;
        this.ObjectNumber        = ObjectNumber ;
        this.ObjectPercentage    = ObjectPercentage ;}

	public Object getObjectNumber() {
		
		return ObjectNumber ;
	}

	public String getObjectPercentage() {
		
		return ObjectPercentage;
	}
	public Object getObjectName() {
		
		return ObjectName ;
	}
}
