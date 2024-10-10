package karthik;
import java.util.*;

public class matrixmulti {
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows and column of MatA:");
		int r1= sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter the number of rows and column of MatB:");
		int r2= sc.nextInt();
		int c2=sc.nextInt();
		int[][] MatA= new int[r1] [c1];
		int [][] MatB= new int[r2] [c2];
		int [][] MatC= new int[r1] [c2];
		if(r1==r2 && c1==c2) {
			System.out.println("Multiplication is possible");
		}
		else {
			System.out.println("Multiplication is not  possible");
		}
		System.out.println("Enter the elements of MatA:");
		for(int i=0;i<r1;i++) {
			for( int j=0;j<c1;j++) {
				MatA[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter the elements of MatB:");
		for(int i=0;i<r2;i++) {
			for( int j=0;j<c2;j++) {
				MatB[i][j]=sc.nextInt();
				
			}
		}
		for( int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				MatC[i][j]=0;
				for(int k=0;k<c1;k++) {
				
				MatC[i][j]+= MatA[i][k] * MatB[k][j];
				}
			}
		}
		System.out.println("Product of MatA and MatB ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++){
				System.out.print(MatC[i][j] + "\t");
				
			}
			System.out.print("\n");
		}
		
		
		
		
	}

}
