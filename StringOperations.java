import java.util.Scanner;
public class StringOperations {
	
	
	
	
	  public static void main(String[] args) {
	
	    //take input strings
		  
		  Scanner s1 = new Scanner(System.in);
		    System.out.print("Enter first string: ");
		    String str1 = s1.nextLine();
		    Scanner s2 = new Scanner(System.in);
		    System.out.print("Enter second string: ");
		    String str2 = s2.nextLine();
		  
		int  option=displayOptions();
	    
	    if (option==1) //compare strings
	    {
	    	if(str1.equals(str2))
	    	{
	    		System.out.println("1");
	    	}
	    	else
	    	{
	    		System.out.println("0");
	    	}
	    	select();
	    }
	    else if(option==2)  //reverse of string
	    {
	    	reverseString(str1,str2);
	    	select();
	    }
	    
	    else if(option==3)    //replace lowercase & uppercase characters
	    {
	    	replace(str1,str2);
	    	select();
	    }
	    
	    else if(option==4)    //largest word of string
	    {
	    	findLarge(str1,str2);
	    	select();
	    }
	    
	    
	    
	    else
	    {
	    	displayOptions();
	    	System.out.println("Select a valid option");
	    }
	
	    /* The reverseStringData() takes StringBuilder
	     objects we need to convert
	     string into StringBuilder */
	
	        
	
	  } //main closed
	  
	  /*display the options*/
	  public static int displayOptions()
	  {
		   	Scanner opt = new Scanner(System.in);
		    System.out.print("Select from the below options:\n ");
		    System.out.print(" 1- Compare two strings \n 2- Reverse both the strings \n 3-Replace lowercase & uppercase characters \n 4-Return largest word of the strings  ");
		    Integer option = opt.nextInt();
		    return option;
	  }
	  
	  /* to display options */
	  public static void select()
	  {
		  Scanner op1 = new Scanner(System.in);
	    	System.out.println(" \n 1- Display options. \n 2-Exit.");
	    	Integer op = op1.nextInt();
	    	if(op==1){
	    	displayOptions();
	    }
	  }
	  
	  
	  /* To reverse the string*/
	  public static void reverseString(String str1, String str2){
		  StringBuilder sb1 = new StringBuilder(str1);
		    StringBuilder sb2 = new StringBuilder(str2);
		
		    /* Now, the return type is also StringBuilder
		     So, create new StringBuilder class object to
		     receive the return value */
		    StringBuilder reversrSb1 = reverseStringData(sb1);
		    StringBuilder reversrSb2 = reverseStringData(sb2);
		   // find reverse
		    String reverseStr1 = new String(reversrSb1);
		    String reverseStr2 = new String(reversrSb2);
		    // display result
		    System.out.println("Reverse of first String: "+reverseStr1);
		    System.out.println("Reverse of second String: "+reverseStr2);
	  }
		  public static StringBuilder reverseStringData(StringBuilder sb){
		    StringBuilder rev = new StringBuilder("");
		    for(int i=sb.length()-1; i>=0; i--){
		      rev.append(sb.charAt(i));
		     System.out.println("Address of rev: "+
		   System.identityHashCode(rev));
		
		    }
		    return rev;
		  
	  }
		  
		  /* to replace lowercase and uppercase characters*/
		  public static void replace(String str1, String str2)
		  {
			  StringBuffer newStr1=new StringBuffer(str1); 
			  StringBuffer newStr2=new StringBuffer(str2); 
	            
		        for(int i = 0; i < str1.length(); i++) {  
		            //Checks for lower case character    
		            if(Character.isLowerCase(str1.charAt(i))) {    
		                //Convert it into upper case using toUpperCase() function    
		                newStr1.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
		            }    
		            //Checks for upper case character    
		            else if(Character.isUpperCase(str1.charAt(i))) {    
		                //Convert it into upper case using toLowerCase() function    
		                newStr1.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
		            }    
		        }    
		        for(int i = 0; i < str1.length(); i++) {  
		            //Checks for lower case character    
		            if(Character.isLowerCase(str2.charAt(i))) {    
		                //Convert it into upper case using toUpperCase() function    
		                newStr2.setCharAt(i, Character.toUpperCase(str2.charAt(i)));    
		            }    
		            //Checks for upper case character    
		            else if(Character.isUpperCase(str2.charAt(i))) {    
		                //Convert it into upper case using toLowerCase() function    
		                newStr2.setCharAt(i, Character.toLowerCase(str2.charAt(i)));    
		            }    
		        }  
		        System.out.println("String after case conversion : " + newStr1); 
		        System.out.println("String after case conversion : " + newStr2);
		  }
		  
		  /* to find the largest word*/
		  
		  public static void findLarge(String str1, String str2)
		  {
			  String[] words1 = new String[100];  
			  String[] words2 = new String[100]; 
		      int length1 = 0, length2=0;
		      String word1 = "", word2="", large1="", large2="";
		      
		    //Add extra space after string to get the last word in the given string    
		      str1 = str1 + " ";  
		      str2 = str2 + " ";
		      /* finding largest word in first string */
		      for(int i = 0; i < str1.length(); i++){    
		          //Split the string into words    
		          if(str1.charAt(i) != ' '){    
		              word1 = word1 + str1.charAt(i);    
		          }    
		          else{    
		              //Add word to array words    
		              words1[length1] = word1;    
		              //Increment length    
		              length1++;    
		              //Make word an empty string    
		              word1 = "";    
		          }    
		      }   
		      
		      //Initialize large with first word in the string    
		      large1 = words1[0]; 
		      
		      for(int k = 0; k < length1; k++){    
	              
		          //If length of large is less than any word present in the string    
		          //Store value of word into large    
		          if(large1.length() < words1[k].length())    
		              large1 = words1[k];    
		      }    
		      
		      /* finding largest word in second string */
		      
		      for(int i = 0; i < str2.length(); i++){    
		          //Split the string into words    
		          if(str2.charAt(i) != ' '){    
		              word2 = word2 + str2.charAt(i);    
		          }    
		          else{    
		              //Add word to array words    
		              words2[length2] = word2;    
		              //Increment length    
		              length2++;    
		              //Make word an empty string    
		              word2 = "";    
		          }    
		      }   
		      
		      //Initialize large with first word in the string    
		      large2 = words2[0]; 
		      
		      for(int k = 0; k < length2; k++){    
	              
		          //If length of large is less than any word present in the string    
		          //Store value of word into large    
		          if(large2.length() < words2[k].length())    
		              large2 = words2[k];    
		      }    
		      
	
		      System.out.println("Largest word in first string: " + large1);  
		      System.out.println("Largest word in second string: " + large2);
		  }
	  
	}