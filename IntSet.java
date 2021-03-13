import java.util.Scanner;


public final class IntSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int counter, num1,num2, set1[],set2[],x;
	      //To capture user input for set1
	      Scanner input1 = new Scanner(System.in);
	      System.out.println("Enter number of elements in the first set:");
	      num1 = input1.nextInt(); 
	      
	      //Creating array to store the all the numbers
	      set1 = new int[num1];

	      System.out.println("Enter " + num1 + " integers between 1 and 1000");
	      //Loop to store each numbers in array
	      for (counter = 0; counter < num1; counter++)
	          set1[counter] = input1.nextInt();
	      
	      //To capture user input for set2
	      Scanner input2 = new Scanner(System.in);
	      System.out.println("Enter number of elements in the second set:");
	      num2 = input2.nextInt(); 
	      
	      //Creating array to store the all the numbers
	      set2 = new int[num2];

	      System.out.println("Enter " + num2 + " integers between 1 and 1000");
	      //Loop to store each numbers in array
	      for (counter = 0; counter < num2; counter++)
	          set2[counter] = input2.nextInt();
	      
	      Scanner input3 = new Scanner(System.in);
	      System.out.println("Enter the member to find");
	      x = input1.nextInt();
	      
	      isMember(x,set1,set2);
	      size(set1,set2);
	      isSubset(set1,set2);
	      getComplement(set1,set2);
	      union(set1,set2);
	}
	
	public static void size(int set1[],int set2[])
	{
		System.out.println("Size of set1 is"+set1.length);
		System.out.println("Size of set2 is"+set2.length);
	}
	
	public static void isSubset(int set1[],int set2[])
	{
		int i = 0;
        int j = 0;
        for (i = 0; i < set2.length; i++) {
            for (j = 0; j < set1.length; j++)
                if (set2[i] == set1[j])
                    break;
 
            /* If the above inner loop 
            was not broken at all then
            arr2[i] is not present in
            arr1[] */
            if (j == set1.length)
                System.out.println("set2 is not a subset of set1");
        }
 
        /* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
        System.out.println("set2 Is a Subset of set1");
	}
	
	public static void getComplement(int set1[],int set2[])
	{
		int complementArray1[],complementArray2[];
		complementArray1= new int[1000];
		int i=0,j,k;
		while( i<=1000)
		{
			for(k=0;k<1000-set1.length;)
			{
				for(j=0;j<set1.length;j++)
				{
					if(i!=set1[j])
						complementArray1[k]=i;
				}
			}
		}
		System.out.println("set1' = \n");
		for(i=0;i<complementArray1.length;i++)
			System.out.println(complementArray1[i]);
		
		complementArray2= new int[1000];
		while( i<=1000)
		{
			for(k=0;k<1000-set2.length;)
			{
				for(j=0;j<set2.length;j++)
				{
					if(i!=set2[j])
						complementArray2[k]=i;
				}
			}
		}
		System.out.println("set1' = \n");
		for(i=0;i<complementArray1.length;i++)
			System.out.println(complementArray1[i]);
	}
	
	public static void union(int set1[],int set2[])
	{
		int union[],i;
		int size= set1.length+set2.length;
		union = new int[size];
		for(i=0;i<set1.length;i++)
			union[i]=set1[i];
		for(i=set1.length;i<(set1.length+set2.length);i++)
			union[i]=set2[i-set1.length];
		System.out.println("Union of set1 and set2 is:\n");
		for(i=0;i<union.length;i++)
		{
			System.out.println(union[i]);
		}
	}
	public static void isMember(int x,int set1[], int set2[])
	{
		for (int counter = 0; counter < set1.length; counter++)
	      {
	         if (set1[counter] == x) 
	         {
	           System.out.println(x+" is the member of set1 ");
	           break;
	         }
	      }
		for (int counter = 0; counter < set2.length; counter++)
	      {
	         if (set2[counter] == x) 
	         {
	           System.out.println(x+" is the member of set2 ");
	           break;
	         }
	      }
	     
	}

}
