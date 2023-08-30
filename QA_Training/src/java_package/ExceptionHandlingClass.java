package java_package;

public class ExceptionHandlingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int z = 1/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero");
		}
		
		
		int add= 20+30;
		System.out.println(add);
	}

}
