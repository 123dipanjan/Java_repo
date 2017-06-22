import java.util.*;
class EmployeeDetails
{
	int eID, salary;
	String name,add,phone;
	Scanner sc;
	public EmployeeDetails()
	{
		sc=new Scanner(System.in);
		eID=12;
		salary=56000;
		name="ABC";
		add="Mumbai";
		phone="897867452";
	}
	public void EnterDetails()
	{
		System.out.println("Enter your name: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter your ID: ");
		eID=sc.nextInt();
		System.out.println("Enter your Contact number: ");
		sc.nextLine();
		phone=sc.nextLine();
	
		System.out.println("Enter your Address: ");
		add=sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		salary=sc.nextInt();
		Display();
	}
	public void Display()
	{
		System.out.println("Name of Employee: "+name);
		System.out.println("Employee ID: "+eID);
		System.out.println("Contact Number: "+phone);
		System.out.println("Employee Address: "+add);
		System.out.println("Employye Salary: "+salary);
	}
	
	public static void main(String[] args)
	{
		EmployeeDetails ed=new EmployeeDetails();
		String ans="";
		do
		{
			System.out.println("-----MENU-----");
			System.out.println("1.Enter Data\n2.Display Data\n3.Exit\nChoose one option");
			int choice=ed.sc.nextInt();
			switch(choice)
			{
				case 1:ed.EnterDetails();break;
				case 2:ed.Display();break;
				case 3:System.exit(0);break;
				default:System.out.println("Invalid option");
	
			}
			System.out.println("Do you want to continue(y/n)");
			ed.sc.nextLine();
			ans=ed.sc.nextLine();

		}while(ans.equalsIgnoreCase("y"));
	}
}