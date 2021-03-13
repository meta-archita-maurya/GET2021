import java.util.*;
public class HexCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter first hexadecimal value ");
		String hex1 = input1.nextLine(); 
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter second hexadecimal value ");
		String hex2 = input1.nextLine(); 
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a decimal number ");
	    int num = input.nextInt();
		
		
		findDecimal(hex1,hex2);
		findHex(num);

	}
	
	public static void add(String hex1, String hex2, int dec1, int dec2)
	{
		 
		System.out.println("Sum of "+hex1+" and "+hex2+" is "+(dec1+dec2));
	}
	
	public static void subtract(String hex1, String hex2, int dec1, int dec2)
	{
		 
		System.out.println("Difference of "+hex1+" and "+hex2+" is "+(dec1+dec2));
	}
	
	public static void multiply(String hex1, String hex2, int dec1, int dec2)
	{
		 
		System.out.println("Product of "+hex1+" and "+hex2+" is "+(dec1+dec2));
	}
	
	public static void divide(String hex1, String hex2, int dec1, int dec2)
	{
		
		System.out.println("Remainder of "+hex1+" and "+hex2+" is "+(dec1+dec2));
	}
	
	public static void compare(String hex1, String hex2, int dec1, int dec2)
	{
		
		if(dec1>dec2)
			System.out.println(hex1+" > "+hex2);
		else if(dec1<dec2)
			System.out.println(hex1+" < "+hex2);
		else
			System.out.println(hex1+" = "+hex2);
		
	}
	
	public static void findDecimal(String hex1, String hex2)
	{
		int dec1=Integer.parseInt(hex1,16);
		int dec2=Integer.parseInt(hex2,16);
		System.out.println("Decimal value of "+hex1+" is "+dec1+" and decimal value of "
		+hex2+" is "+dec2);
		
		add(hex1,hex2,dec1,dec2);
		subtract(hex1,hex2, dec1,dec2);
		multiply(hex1,hex2,dec1,dec2);
		divide(hex1,hex2,dec1,dec2);
		compare(hex1,hex2,dec1,dec2);
		
	}
	
	public static void findHex(int dec)
	{
		System.out.println(Integer.toHexString(dec));
	}

}
