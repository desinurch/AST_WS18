import java.util.Scanner;
public class Ex6 {

   private static Scanner readme;
   
   public static int[] inputs()
   {
       int n1,n2,n3;
       int[] input = new int[3];
       
       readme = new Scanner(System.in);
       do{
           System.out.println("Enter n1 : an integer between 1 and 1000000");
           n1 = readme.nextInt();
        }while(n1 < 1 || n1 > 1000000 );
       
       System.out.println("Enter n2");
       n2=readme.nextInt();
       
       do{
           System.out.println("Enter n3 , n3 must be greater than "+n2);
           n3=readme.nextInt();
       }while(n2 >= n3);
       
       input[0] = n1;
       input[1] = n2;
       input[2] = n3;
       
       return input;
   }
   
   public static double[] random_numbers(int n)
   {
       double[] ArrayRandom = new double[n];
       
       for(int i=0;i<n;i++)
       {
           ArrayRandom[i]= Math.random();
       }
       return ArrayRandom;
   }
   
   public static double add(double[] ArrayRandom)
   {
       double sum = 0;
       for (int i=0; i<ArrayRandom.length; i++) {
           sum = sum + ArrayRandom[i];
       }
       return sum;
   }
   
   public static double multiply(double[] ArrayRandom)
   {
       double product = 1;
       for (int i=0; i<ArrayRandom.length; i++) {
           product = product * ArrayRandom[i];
       }
       return product;
   }
   
   public static double mean(double sum, int n)
   {
       double average = sum/n;        
       return average;
   }
   
   public static double variance(double[] ArrayRandom, double average)
   {
       double a, variance = 0;
       
       for (int i=0; i<ArrayRandom.length; i++) {
           a= ArrayRandom[i] - average;
           variance = (variance + a *a);
       }
       variance= variance / ArrayRandom.length-1 ;
       
       return variance;
   }
   
   public static double min(double[] ArrayRandom)
   {
       double minimum = ArrayRandom[0];
       for(int i=1 ; i<ArrayRandom.length ; i++){
           minimum =  Math.min(minimum,ArrayRandom[i] );
       }
       return minimum;
   }
   
   public static double max(double[] ArrayRandom)
   {
       double maximum = ArrayRandom[0];
       for(int i=1 ; i<ArrayRandom.length ; i++){
           maximum =  Math.max(maximum,ArrayRandom[i] );
       }
       return maximum;
   }

   public static void main(String[] args) {
       
       int[] inputs = inputs();
       double[] ArrayRandom = random_numbers(inputs[0]);
       double sum = add(ArrayRandom);
       double product = multiply(ArrayRandom);
       double average = mean(sum,inputs[0]);
       double variance = variance(ArrayRandom,average);
       double minimum = min(ArrayRandom);
       double maximum = max(ArrayRandom);
       
       System.out.println("Sum : " + sum);
       System.out.println("Product : " + product);
       System.out.println("Average : " + average);
       System.out.println("Variance : " + variance);
       System.out.println("Minimum : " + minimum);
       System.out.println("Maximum : " + maximum);
           
                         
   }
}
