package javapro;
import java.util.Scanner;
class Employee3
{
	String name;
	long ID;
	void printname()
	{
		System.out.println("Name:"+name);
	}
	void printID()
	{
		System.out.println("ID:"+ID);
	}
}
class Manager1 extends Employee3
{
	String dept;
	void printdept()
	{
		System.out.println("Department:"+dept);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employee3 e=new Employee3();
		Manager1 m=new Manager1();
		System.out.println("Enter the employee's name:");
		e.name=sc.nextLine();
		System.out.println("Enter the employee ID:");
		e.ID=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the manager's name:");
		m.name=sc.nextLine();
		System.out.println("Enter the manager's ID:");
		m.ID=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the department:");
		m.dept=sc.nextLine();
		System.out.println("\nEMPLOYEE DETAILS");
		e.printname();
		e.printID();
		System.out.println("\nMANAGER DETAILS");
		m.printname();
		m.printID();
		m.printdept();
	}
}


