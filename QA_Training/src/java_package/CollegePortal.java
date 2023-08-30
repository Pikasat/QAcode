package java_package;

public class CollegePortal {

	
	void feestructure()
	{
		System.out.println("The basic fee is $500");
	}
	
	void feestructure(int a)
	{
		System.out.println("The fee after adding extra activities is $1000");
	}
	public static void main(String[] args) {
		// compiletime 
		CollegePortal obj= new CollegePortal();
		obj.feestructure();
		obj.feestructure(500);
		
		StudentData obj1= new StudentData();
		obj1.studentProfile();
		obj1.studentLogin();
		obj1.nameCollege();
		obj1.department();
		// runtime
		obj1.attendance();
	}

}

class College 
{
	void nameCollege()
	{
		System.out.println("The nme of college is Oxford");
	}
protected 	void department()
	{
		System.out.println("There are different departments");
	}
	
 	void attendance()
	{
		System.out.println("The minimum attendance of college is 75%");
	}
}


class StudentData extends College
{
	void studentProfile()
	{
		System.out.println("the name of student Mubarak");
		System.out.println("The address of student");
	}
	
	void studentLogin()
	{
		String username="Mubarak12";
		String password="1234";
		System.out.println("The username and password is "+username+ " "+password);
	}
	
	void attendance()
	{
		System.out.println("The attendance of student is 80%");
	}
}