package karthik;
import java.util.*;

public class frequency {

	public static void main(String[] arg) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string:");
	String str=sc.nextLine();
	System.out.println("Enter the charater:");
	char cha=sc.next().charAt(0);
	
	int i,freq=0;
	for(i=0;i< str.length();i++) {
		if(str.charAt(i)==cha) {
			freq++;
		}
		
	}
	System.out.print(freq +" " + "times");
	}

}


