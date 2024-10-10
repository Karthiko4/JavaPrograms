package karthik;
import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		int n=str.length();
		String rev=new String();
		for(int i=n-1;i>=0;i--) 
		{
			 rev=rev+str.charAt(i);
		}
		System.out.println("reverse:"+" "+rev);
		if (str.equals(rev)) 
		{
			System.out.println(str+" "+"is"+" "+"palindrome");
		}
		else 
		{
			System.out.println(str+" "+"is"+" "+"not"+" "+"palindrome");
		}
	}
}


