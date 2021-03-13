import java.util.Scanner;


public class JobScheduler {
	
	public static void main(String args[])
	{
		 int num,process[][];
		 //To capture user input
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter number of processes:");
	      num = input.nextInt(); 

	      //Creating array to store the all the numbers
	      process = new int[num][3];

	      
	      /*1st column will store process number, 2nd will store arrival time,
	       *  3rd will store burst time.
	       */
	      for (int i = 0; i < num; i++)
	      {
	    	  
	    	  process[i][0] = i;
	    	  System.out.println("Enter arrival time and burst time of process "+i);
	    	  process[i][1] = input.nextInt();
	    	  process[i][2] = input.nextInt();
	      }
	      
	      findResults(num, process);
	}
	public static void findResults(int num, int process[][])
	{
		int wt[] = new int[num], tat[] = new int[num]; 
        int total_wt = 0, total_tat = 0, avg_wt, avg_tat; 
  
        //Function to find waiting time of all processes  
        findWaitingTime(process, num, wt); 
  
        //Function to find turn around time for all processes  
        findTurnAroundTime(process, num, wt, tat); 
        
      //Function to find completion time for all processes  
        findCompletionTime(process, num, tat); 
  
        // Calculate total waiting time and total turn around time  
        for (int i = 0; i < num; i++) 
        { 
            total_wt = total_wt + wt[i]; 
            total_tat = total_tat + tat[i]; 
        }
        
        avg_wt = total_wt/num;
        avg_tat = total_tat/num;
        
        System.out.println("Average waiting time of processes is:"+avg_wt);
        System.out.println("Average turn around time of processes is:"+avg_tat);
	}
	public static void findWaitingTime(int process[][], int num, int wt[])
	{
		// waiting time for first process is 0  
        wt[0] = 0; 
  
        // calculating waiting time  
        for (int i = 1; i < num; i++) 
        { 
            wt[i] = process[i - 1][2] + wt[i - 1]; 
        } 
        
        for(int i=1; i<num;i++)
        	System.out.println("Waiting time of process "+i+" is "+wt[i]);
	}
	
	public static void findTurnAroundTime(int process[][],int num,int wt[],int tat[])
	{
		// calculating turn around time by adding  
        // bt[i] + wt[i]  
        for (int i = 0; i < num; i++) 
        { 
            tat[i] = process[i][2] + wt[i]; 
        } 
        for(int i=1; i<num;i++)
        	System.out.println("Turn around time time of process "+i+" is "+tat[i]);
	}
	
	public static void findCompletionTime(int process[][], int num, int tat[])
	{
		int ct[] = new int[num];
		// calculating completion time by adding  
        // arrival time and turn around time  
        for (int i = 0; i < num; i++) 
        { 
            ct[i] = process[i][1] + tat[i]; 
        } 
        for(int i=1; i<num;i++)
        	System.out.println("Completion time of process "+i+" is "+ct[i]);
	}

}
