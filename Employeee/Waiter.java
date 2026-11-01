package Employeee;
import java.util.Scanner;
import java.lang.*;

public class Waiter extends Employee
{
	public Waiter () {}
	
	public Waiter (String name , String NID , String address ,
                	double salary , double workingDays ,String contactNum)
	{
		super (name , NID , address , salary , workingDays , contactNum);
	}
	public Waiter (String name , String NID , String address , String contactNum)
	{
		super (name , NID , address, contactNum);
	}
	
	public void showDetails ()
	{
		System.out.println("I am a WAITER");
		super.showDetails ();
	}
	
	
	
	
	
}