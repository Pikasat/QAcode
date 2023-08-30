package java_package;

public class StudentProtal extends StudentProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentProfile obj= new StudentProfile();
		obj.settterId(101);
		System.out.println(obj.getterId());
		}

	

}
 
 class StudentProfile
{
	private int id ;
	
	void settterId(int a)
	{
		id=a;
	}
	
	int getterId()
	{
		return id;
	}
	
	
	
	void display()
	{
		System.out.println("Student profile is displayed ");
	}
	
}