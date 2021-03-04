import java.util.Scanner;


public class hcf {
	
	// Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        // Everything divides 0 
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
     
    // Driver method
    public static void main(String[] args) 
    {
int a, b; 
        
        Scanner input1 = new Scanner(System.in);
	      System.out.println("Enter first number");
	      a = input1.nextInt();
	      
	      Scanner input2 = new Scanner(System.in);
	      System.out.println("Enter second number");
	      b = input2.nextInt();
	      
        System.out.println("HCF of " + a +" and " + b + " is " + gcd(a, b));
    }
    
}
