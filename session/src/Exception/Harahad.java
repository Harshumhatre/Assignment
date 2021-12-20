package Exception;

public class Harahad {
	public void happen() throws Blocked
	{
		System.out.println("Hello,kutti");
	throw new Blocked("your not eligilble");	
	}
	public static void main(String[] args) {
		Harshad harshasd=new Harshad();
		try {
			Harshad.happen();
		} catch ( Blocked e) {
			// TODO: handle exception
		}
		
	}

}
