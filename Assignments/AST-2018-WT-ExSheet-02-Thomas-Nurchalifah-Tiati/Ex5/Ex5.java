
public class Ex5 {
    public static long[] found_prime_numbers(String type)
    {
    
        int i,j,n_dividers;
        long k;
        boolean isFound_min=false;
        boolean isFound_max=false;
    	long[] resultValues = new long[2];
    	
        if (type.equals("Integer"))
        {

        	//Count the minimum and maximum prime numbers in the range of 0-maximum of integer
        	i = 0;
        	while (isFound_min==false)
        	{
        		n_dividers=0;
            	for(j=1; j<=i; j++)
            	{
            		if(i%j==0)
            			n_dividers=n_dividers+1;
            	}
            	if(n_dividers==2)
            	{
            		isFound_min = true;
            		resultValues[0] = i;
            	}
            	i++;
        	}
        	
        	i=Integer.MAX_VALUE;
        	while (isFound_max==false)
        	{
        		n_dividers=0;
            	for(j=1; j<=i; j++)
            	{
            		if(j==0)
            			break;
            		else if(i%j==0)
            			n_dividers=n_dividers+1;
            	}
            	if(n_dividers==2)
            	{
            		isFound_max = true;
            		resultValues[1] = i;
            	}
            	i--;
        	}
        	
        }
        
       	//Count the minimum and maximum prime numbers in the range of 0-maximum of long integer
        if (type.equals("Long integer"))
        {
        	k = 0;
        	while (isFound_min==false)
        	{
        		n_dividers=0;
            	for(j=1; j<=k; j++)
            	{
            		if(k%j==0)
            			n_dividers=n_dividers+1;
            	}
            	if(n_dividers==2)
            	{
            		isFound_min = true;
            		resultValues[0] = k;
            	}
            	k++;
        	}
        	
        	k=Long.MAX_VALUE;
        	while (isFound_max==false)
        	{
        		n_dividers=0;
            	for(j=1; j<=k; j++)
            	{
            		if(j==0)
            			break;
            		else if(k%j==0)
            			n_dividers=n_dividers+1;
            	}
            	if(n_dividers==2)
            	{
            		isFound_max = true;
            		resultValues[1] = k;
            	}
            	k--;
        	}
        }
        return resultValues;     
    }
    
    public double counting_time(int  min,int max)
    {
        double start, elapsedTime;
         start = System.nanoTime();
        
         int i =min ;
         while(i < max)
         {
             i++;
         }
         elapsedTime = System.nanoTime() - start;
         return elapsedTime;
        // System.out.println("the time needed to count from the smallest to the largest integer is : "+ elapsedTime);
        
    }

    public static void main(String[] args) {
        
        Ex5 ex =new Ex5();
        long[] intValues = found_prime_numbers("Integer");
        long[] longValues = found_prime_numbers("Long integer");
        System.out.println(intValues[0]);
        System.out.println(intValues[1]);
        System.out.println(longValues[0]);
        System.out.println(longValues[1]);
        System.out.println(ex.counting_time(0,400));
        System.out.println(ex.counting_time(0,800));
        System.out.println(ex.counting_time(0,4000));
        
        
    }
}
