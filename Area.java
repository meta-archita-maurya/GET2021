import java.util.*;


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
float width, height, radius; 
        try{
          Scanner input1 = new Scanner(System.in);
	      System.out.println("Enter width");
	      width = input1.nextFloat();
	      
	      Scanner input2 = new Scanner(System.in);
	      System.out.println("Enter height");
	      height = input2.nextFloat();
	      
	      Scanner input3 = new Scanner(System.in);
	      System.out.println("Enter radius");
	      radius = input3.nextFloat();
	      
	      if(width>=0 && height>=0 && radius>=0){

	      areaOfTriangle(width,height);
	      areaOfRectangle(width,height);
	      areaOfSquare(width);
	      areaOfCircle(radius);
	      
	      }
	      else{
	    	  throw new Exception(); //Checks if all input dimensions are positive or not.
	      }}
        catch(Exception e)
        {
        	System.out.println("Error: Enter positive dimensions");
        }
	}
	
	/*Calculates area of triangle with input width and height*/
	public static void areaOfTriangle(float width, float height)
	{
		try{
			
		System.out.println("Area of triangle with width="+width+"and height ="+height+
				"is:\n"+ (width*height/2) );
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	/*Calculates area of rectangle with input width and height*/
	public static void areaOfRectangle(float width, float height)
	{
		try{
			
		System.out.println("Area of rectangle with width="+width+"and height ="+height+
				"is:\n"+ (width*height) );
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	/*Calculates area of square with side input width*/
	public static void areaOfSquare(float width)
	{
		try{
		System.out.println("Area of square with width="+width+
				"is:\n"+ (width*width) );
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	/*Calculates area of circle with input radius*/
	public static void areaOfCircle(float radius)
	{
		try{
		System.out.println("Area of circle with radius="+radius+
				"is:\n"+ (3.14*radius*radius) );
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

