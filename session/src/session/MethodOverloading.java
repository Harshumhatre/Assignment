package session;

public class MethodOverloading {
	public void login(String username,long mobilenumber)
	{
		System.out.println("your usernamre is "+username);
		System.out.println("your mobilenumber is "+mobilenumber);
	}
	public void login(String username, String password)
	{
		System.out.println("your userid is "+username);
		System.out.println("your password is "+password);
	}
	public static void main(String[] args) {
	MethodOverloading obj=new MethodOverloading();
	obj.login("Har@1234",1151361372l);
	System.out.println("-------------------------------");
	obj.login("Har@1234","HarSh@313");
	}

}
