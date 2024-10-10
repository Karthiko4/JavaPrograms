package karthik;
import java.util.*;


public class ExceptionHandling {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.print("\n1.Arithmetic Exception");
			System.out.print("\n2.Array Index Out Of Bounds Exception");
			System.out.print("\nEnter your choise:");
			
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1:
		
	    System.out.print("Enter the 1st number:");
		int n1= sc.nextInt();
		System.out.print("Enter the 2nd number:");
		int n2=sc.nextInt();
		try {
		int Result=n1/n2;
		System.out.print("Result=" + Result);
		System.out.print("\nEnd of try block");
		}
		
		catch( ArithmeticException e)
		{
			System.out.print(e);
			
		}
		finally {
			System.out.print("\nFinally Block content");
			System.out.print("\nMy code is safe from Exception");
		}break;
		
			case 2:
		System.out.print("Enter the number of elements in the array:");
		int n=sc.nextInt();
		int A[] = new int[n];
		System.out.print("Enter the array elements");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();		}
		System.out.print("\narray lenght:" + A.length);
		System.out.print("\nArray Elements are:");
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nEnter the positiom of element you want to access:");
		int pos=sc.nextInt();
		try{
			System.out.print(A[pos]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("\nArray index is out of bound");
		}
		break;
		
			default:System.out.print("\nEnter a choise");
			break;
		} 
			System.out.print("\nDo you want to continue:");
			ch=sc.next().charAt(0);
			}
		
		while(ch=='y');
		System.out.print("EXITING....");
	}
		
	}



