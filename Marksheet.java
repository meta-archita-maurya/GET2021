import java.util.*;
public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [] grades;
		int num,i;
		//takes input of the total number of students
		Scanner input = new Scanner(System.in);
	      System.out.println("Enter the number of students:");
	      num = input.nextInt();
	      
	    //Creating array to store the all the grades
	      grades = new float[num]; 
	      System.out.println("Enter grades of all " + num + " students");
	      //Loop to store each numbers in array
	      for (i = 0; i < num; i++)
	        grades[i] = input.nextFloat();
	      
	      average(grades,num);  //to find the average of grades
	      maximum(grades,num);  //to find maximum among all grades
	      minimum(grades,num);  //to find minimum among all grades
	      percentageOfPassed(grades,num); //to find the percentage of the students that passed
	}
	
	/* takes the array of grades and number of students as input and 
	  returns the average of all the grades by finding the mean*/
	
	public static void average(float []grades, int num)
	{
	try{	
			float sum=0,avg;
		
		for(int i=0;i<num;i++)
		{
			sum+= grades[i];
		}
		avg= sum/num;
		 System.out.println("Average Grades: "+String.format("%.2f",avg));
	}
	catch(Exception e)
	{
		System.out.println("Something went wrong");
	}}

	
	/* takes the array of grades and number of students as input and 
	  returns the maximum among all the grades*/
	public static void maximum(float []grades, int num)
	{
		try{
		float max=grades[0];
		for(int i=1; i <num; i++)
		{
			if(grades[i]>max)
			{
				max=grades[i];
			}
		}
		 System.out.println("Maximum Grade: "+String.format("%.2f",max));
		}
		 catch(Exception e)
			{
				System.out.println("Something went wrong");
			}
	}
	
	/* takes the array of grades and number of students as input and 
	  returns the minimum among all the grades*/
	public static void minimum(float []grades, int num)
	{
		try{
	
		float min=grades[0];
		for(int i=1; i <num; i++)
		{
			if(grades[i]<min)
			{
				min=grades[i];
			}
		}
		 System.out.println("Minimum Grade: "+String.format("%.2f",min));
	}
		 catch(Exception e)
			{
				System.out.println("Something went wrong");
			}
	}
	
	/* takes the array of grades and number of students as input and 
	  returns the percentage of passed students considering 40 as passing grade*/
	public static void percentageOfPassed(float []grades,int num)
	{
		try{
	
		int count=0;
		float percentage;
		for(int i=0;i<num;i++)
		{
			if(grades[i]>=40)
			{
				count++;
			}
		}
		
		percentage=(count/(float)num)*100;
		 System.out.println("Percentage of Passed Students: "+String.format("%.2f",percentage));
		}
		 catch(Exception e)
			{
				System.out.println("Something went wrong");
			} 
	}
	
}

