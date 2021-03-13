import java.util.*;
public final class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int power,terms1,terms2, coefficient, polynomialArray1[][],polynomialArray2[][];
		polynomialArray1=new int[100][100];
		polynomialArray2=new int[100][100];
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the number of terms in the first polynomial");
		terms1 = input1.nextInt();
		
		for(coefficient=0;coefficient<terms1;coefficient++)
		{
			for(power=0;power<2;power++)
			{
				polynomialArray1[coefficient][power] =input1.nextInt();
			}
		}
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the number of terms in the second polynomial");
		terms2 = input2.nextInt();
		
		System.out.println("Enter the coefficient and power respectively for each term");
		for(coefficient=0;coefficient<terms2;coefficient++)
		{
			for(power=0;power<2;power++)
			{
				polynomialArray2[coefficient][power] =input2.nextInt();
			}
		}
		
		evaluate(terms1,terms2,polynomialArray1,polynomialArray2);
		degree(terms1,terms2,polynomialArray1,polynomialArray2);
		addPoly(terms1,terms2,polynomialArray1,polynomialArray2);
		multiplyPoly(terms1,terms2,polynomialArray1,polynomialArray2);

	}
	
	public static void evaluate(int terms1,int terms2, int polynomialArray1[][],int polynomialArray2[][])
	{
		
	}
	
	public static void degree(int terms1,int terms2, int polynomialArray1[][],int polynomialArray2[][])
	{
		int degree1=0,degree2=0,i;
		for(i=0;i<terms1;i++)
		{
			if(polynomialArray1[0][i]>degree1)
			{
				degree1=polynomialArray1[0][i];
			}
		}
		for(i=0;i<terms2;i++)
		{
			if(polynomialArray2[0][i]>degree2)
			{
				degree1=polynomialArray2[0][i];
			}
		}
		System.out.println("The degree of first polynomial is \t"+degree1+"\t and degree of second polynial is"+degree2);
	}
	
	public static void addPoly(int terms1,int terms2, int polynomialArray1[][],int polynomialArray2[][])
	{
		int i,j,sum[][];
		sum= new int[100][100];
		for (i=0;i<terms1;i++)
		{
			for(j=0;j<terms2;j++)
			{
				if(polynomialArray1[i][2]==polynomialArray2[j][2])
				{
					sum[i][1]= polynomialArray1[i][1]+polynomialArray2[i][1];
					sum[i][2]=polynomialArray1[i][2];
				}
			}
		}
		for(i=0;i<sum.length;i++)
		{
			
			System.out.println("coefficient=\t"+sum[i][1]+",power=\t"+sum[i][2]);
		
		}
	}
	
		
	
	public static void multiplyPoly(int terms1,int terms2, int polynomialArray1[][],int polynomialArray2[][])
	{
		
	}

}
