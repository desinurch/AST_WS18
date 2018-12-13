
public class Ex7 {
	public double f(int k,int n)
    {
        double product=1;
        double[] array=new double[n+1];
        array[1]=0.5;
        for(int i=2;i<k;i++)
        {
            array[i]=0.9;
        }
        for(int i=k;i<n+1;i++)
        {
            array[i]=0.1;
        }
        
       for(int i=1;i< array.length;i++)
       {
           product=product*(array[i]/(1-array[i]));
       }
      
       product= 1+product;
       product = 1/product;
      
      
        return 1-product;
                
    }

	// optimising the function f
    public double f1(int k,int n)
    {
        double product=1;    
        product=product*(0.5/(1-0.5));
        for(int i=2;i<k;i++)
        {
            product=product*(0.9/(1-0.9));
            
        }
        
        for(int i=k;i<n+1;i++)
        {
            product=product*(0.1/(1-0.1));
            
        }
        
      
       product= 1+product;
       product = 1/product;
      
      
        return 1-product;
                
    }
    
    public static void main(String[] args) {
        
        Ex7  a=new Ex7();
        System.out.println(a.f(10,20));
        System.out.println(a.f(100,120));
        System.out.println(a.f(1000,1200));
        System.out.println(a.f(10000,10200));
        
        System.out.println(a.f1(10,20));
        System.out.println(a.f1(100,120));
        System.out.println(a.f1(1000,1200));
        System.out.println(a.f1(10000,10200));
        System.out.println(a.f1(100000,1020000000));
        
    }
}
