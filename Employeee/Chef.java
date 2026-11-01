package Employeee;
import java.util.Scanner;
import java.lang.*;

public class Chef extends Employee
{
	public Chef () {}
	public Chef (String name , String NID , String address ,
         	double salary , double workingDays  , String contactNum)
	{
		super (name , NID , address , salary , workingDays , contactNum);
	}
	public Chef (String name , String NID , String address , String contactNum)
	{
		super (name , NID , address, contactNum);
	}
	
	public void showDetails ()
	{
		System.out.println("I am a CHEF");
		super.showDetails ();
	}
}