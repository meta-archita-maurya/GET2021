import java.util.Scanner;


public class lcm {
	
	// Recursive method to return gcd of a and b 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b;  
        return gcd(b % a, a);  
    } 
      
    // method to return LCM of two numbers 
    static int lcm(int a, int b) 
    { 
        return (a / gcd(a, b)) * b; 
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
	      
	      
        System.out.println("LCM of " + a + 
                           " and " + b +  
                      " is " + lcm(a, b)); 
    }

}
