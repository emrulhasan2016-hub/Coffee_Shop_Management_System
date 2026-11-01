package Employeee;
import Interface.*;
import java.lang.*;

public class Manager implements IinterfaceEmployee
{
	Employee employee[];
	int maxSize = 0;
	int minEmployee = 0;
	
	public Manager() {}
	public Manager(int maxEmployee)
	{
		this.employee = new Employee[maxEmployee];
		this.maxSize = maxEmployee;
	}
	
	public int getEmployeeLeft(){return maxSize-minEmployee;}
	
	public void addEmployee (Employee e)
	{
		boolean flag = false;
		
		for (int i=0 ; i<employee.length ; i++)
		{
			if(employee[i] == null)
			{
				employee[i] = e;
				flag = true;
				minEmployee++;
				break;
			}
		}
		if (flag) {System.out.println("Employee Inserted");}
		else {System.out.println("Employee Can Not Insert");}
	}
	
	public void removeEmployee (Employee e)
	{
		boolean flag = false;
		
		for(int i=0 ; i<employee.length ; i++)
		{
			if (employee[i] == e)
			{
				employee[i] = null;
				flag = true;
				minEmployee--;
				break;
			}
		}
		if (flag) {System.out.println("Employee Removed");}
		else {System.out.println("Employee Can Not Removed");}
	}
	
	public Employee getEmployeeByEmployeeNID (String NID)
	{
		Employee e = null;
		for(int i=0 ; i<employee.length ; i++)
		{
			if(employee[i] != null)
			{
				if(employee[i].getNID() == NID)
				{
					e = employee[i];
					break;
				}
			}
		} return e;
	}
	
	public void showAllEmployee()
	{
		for (int i=0 ; i<employee.length ; i++)
		{
			if (employee[i] != null)
			{
				System.out.println("===========================");
				 employee[i].showDetails();
				 System.out.println("           ");
			}
		}
	}
	
	
	public void showAllChef()
	{
		for(int i=0 ; i<employee.length ; i++)
		{
			if(employee[i] != null)
			{
				if(employee[i] instanceof Chef)
				{
					System.out.println("====================");
					employee[i].showDetails();
					System.out.println("           ");
				}
			}
		}
	}
	
	public void showAllCleaner()
	{
		for(int i=0 ; i<employee.length ; i++)
		{
			if(employee[i] != null)
			{
				if(employee[i] instanceof Cleaner)
				{
					System.out.println("====================");
					employee[i].showDetails();
					System.out.println("           ");
				}
			}
		}
	}
	
	public void showAllWaiter()
	{
		for(int i=0 ; i<employee.length ; i++)
		{
			if(employee[i] != null)
			{
				if(employee[i] instanceof Waiter)
				{
					System.out.println("====================");
					employee[i].showDetails();
					System.out.println("           ");
				}
			}
		}
	}
	
	
	
	
	
	
	
}