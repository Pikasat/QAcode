package java_package;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {10,20,30,40};
		try {
		System.out.println(a[04]);
		}
		catch(Exception e)
		{
			System.out.println("array exception handled");
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
