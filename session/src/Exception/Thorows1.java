package Exception;

public class Thorows1 {
		public void harshad() throws Throwable,Exception 
		{
			System.out.println("I did not do it");
			throw new Throwable();
		}
	 
	public static void main(String[] args) {
		
		System.out.println("Who has done it?");
		Throws td=new Throws();
		try {
			td.harshad();	
		}
		catch (Exception e) {
			System.out.println("Exception occured");
		}
	}
	}
