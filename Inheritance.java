package karthik;
import java.util.*;
class Employee{
	String name;
	int age,salary;
	String address;
	long phone;
	
	void printemp()
	{
		System.out.print("\nName:" + name);
		System.out.print("\nAge:" + age);
		System.out.print("\nAddress:" + address);
		System.out.print("\nPhone number:" + phone);
	}
	
	void Printsalary() 
	{
		System.out.print("Salary:"+ salary);
    }
	
}
class Officer extends Employee{
	String specialisation;
	void printspecialisation()
	{
		System.out.println("\nEnter the Specialization:" + specialisation );
	}
}
class Manager extends Employee{
	String department;
	void printdepartment() {
		System.out.println("\nEnter the Department:" + department);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Officer offi= new Officer();
		Manager man= new Manager();
		
		System.out.print("Enter the Officer name:");
		offi.name=sc.next();
		System.out.print("Enter the address:");
		offi.address= sc.next();
		System.out.print("Enter Specialisation:");
		offi.specialisation=sc.next();
		System.out.print("Enter Age:");
		offi.age=sc.nextInt();
		System.out.print("Enter the phone number:");
		offi.phone= sc.nextLong();
		System.out.print("Enter Salary:");
		offi.salary=sc.nextInt();
		System.out.print("Enter the Manager name:");
		man.name=sc.next();
		System.out.print("Enter the address:");
		man.address= sc.next();
		System.out.print("Enter Specialisation:");
		man.department=sc.next();
		System.out.print("Enter Age:");
		man.age=sc.nextInt();
		System.out.print("Enter the phone number:");
		man.phone= sc.nextLong();
		System.out.print("Enter Salary:");
		man.salary=sc.nextInt();
		
		System.out.print("\nOFFICER DETAILS:");
		 offi.printemp();
		 offi.Printsalary();
		 offi.printspecialisation();
		 
		 System.out.print("\nMANAGER DETAILS:");
		 man.printemp();
		 man.Printsalary();
		 man.printdepartment();
		 
		
		
			
	}
}
