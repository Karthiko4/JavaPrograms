package karthik;
import java.util.*;

abstract class Animal
{
	protected int legs;
	Animal(int legs)
	{
		this.legs=legs;
	}
	
	void walk()
	{
		System.out.print("\nThe animal walks by " +legs +" legs");
	}
	

}

class Spider extends Animal
{
	Spider(int legs)
	{
		super(legs);
	}
	void eat()
	{
		System.out.print("\nSpider eats insects");
	}
}

interface pet{

	abstract void getname();
	abstract void setname(String name);
	abstract void play();
}

class Cat extends Animal implements pet
{  String name;
	Cat( String name, int legs)
	{
		super(legs);
		this.name=name;
	}
	 public void getname()
	{
		System.out.print("\nThe cats name is "+ name);
	}
	 public void setname(String name)
	 {
		this.name=name;
	 }
	 public void play()
	 {
		 System.out.print("\nThe cat plays with rats");
	 }
	 public void eat()
	 {
		 System.out.print("\nCat eat fishes");
	 }
}
class Fish extends Animal implements pet
{
	String name;
	Fish( String name)
	{
		super(0);
		this.name=name;
	}
	 public void getname()
	{
		System.out.print("\nThe Fish name is "+name);
	}
	 public void setname(String name)
	 {
		System.out.print("\nThe fish name is "+ name);
	 }
	 public void play()
	 {
		 System.out.print("\nThe Fish plays in water");
	 }
	 public void eat()
	 {
		 System.out.print("\nThe Fish eat plants");
	 }
	 public void walk()
	 {
		 System.out.println("\nThe Fish have no legs");
	 }
}

public class Interface {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("...SPIDER...");
		Spider ob= new Spider(8);
		ob.walk();
		ob.eat();
		System.out.print("\n...CAT...");
		Cat c= new Cat("Fluffy",4);
		c.getname();
		c.setname("Moose");
		c.getname();
		c.play();
		c.eat();
		System.out.print("\n...FISH...");
		Fish f= new Fish("Mimi");
		f.getname();
		f.setname("Momo");
		f.play();
		f.eat();
				
		
		
		
	}
	

}



