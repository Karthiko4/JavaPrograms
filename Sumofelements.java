package javapro;
import java.util.*;

public class Sumofelements{
	public static void main(String[] args) 
	{
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements in a array");
	int n=sc.nextInt();
	System.out.print("Enter the elemnts:");
	int[] array=new int[n];
	int sum=0;
	for(int i=0;i<n;i++) {
		 array[i]=sc.nextInt();}
	
		 System.out.println("The array is");
		 for(int i=0;i<n;i++) {
			 System.out.println(array[i]+"\t");
			 sum= sum+array[i];}
			 
		 System.out.println("The sum is:"+ sum);
			 
		 }
		 
	

	
	}
	
	