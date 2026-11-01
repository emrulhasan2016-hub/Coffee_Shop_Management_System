package Employeee;
import java.util.Scanner;
import java.lang.*;
 
 public class Employee
 {
	 private String name;
	 private String NID;
	 private String address;
	 private double salary;
	 private double workingDay;
	 private String contactNum;
	 
	 public Employee () { }
	 
	 public Employee (String name , String NID , String address ,
						double salary , double workingDays  , String contactNum)
	 {
		 this.name = name;
		 this.NID = NID;
		 this.address = address;
		 this.salary = salary;
		 this.workingDay = workingDay;
		 this.contactNum = contactNum;
	 }
	 
	 public Employee (String name , String NID , String address , String contactNum)
	 {
		 this.name = name;
		 this.NID = NID;
		 this.address = address;
		 this.contactNum = contactNum;
	 }
	 
	 
	 
	 public void setname (String name) {this.name = name;}
	 public String getname () {return this.name;}
	 
	 public void setNID (String NID) {this.NID = NID;}
	 public String getNID () {return this.NID;}
	 
	 public void setaddress (String address) {this.address = address;}
	 public String getaddress () {return this.address;}
	 
	 public void setsalary (double salary) {this.salary = salary;}
	 public double getsalary () {return this.salary;}
	 
	 public void setworkingDay (double workingDay) {this.workingDay = workingDay;}
	 public double getworkingDay () {return this.workingDay;}
	 
	 public void setcontactNum (String contactNum) {this.contactNum = contactNum;}
	 public String getcontactNum () {return this.contactNum;}
	 
	 public void Bonus(double amount){this.salary += amount;}
	 
	 public void showDetails ()
	 {
		 System.out.println ("\nName         : " +name);
		 System.out.println ("NID          : " +NID);
		 System.out.println ("Address      : " +address);
		 System.out.println ("Salary       : " +salary);
		 System.out.println ("WorkingDay   : " +workingDay);
		 System.out.println ("ContactNumber: " +contactNum);
	 }
 }