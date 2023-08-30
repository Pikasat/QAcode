package java_package;

public class Bank implements Calculator{
	
	Bank(String username,String password )
	{
		System.out.println(username+ " "+password );
	}

int acct=2000;

void deposit(int depamt)
{
	acct= acct+depamt;
	System.out.println("The amount after deposit "+acct);
}	
void withdraw(int witdamt)
{
	acct=acct-witdamt;
	System.out.println("The amount after withdraw "+acct);
	
}

int display()
{
	return acct;
}
	public static void main(String[] args) {
		// Create a object
		Bank obj = new Bank("Mubarak12","1234");
		obj.deposit(1000);
		obj.withdraw(500);
		System.out.println(obj.display());
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mutiple() {
		// TODO Auto-generated method stub
		
	}

}
