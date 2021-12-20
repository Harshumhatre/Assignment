package N1;

public class P2 {
public  int fact(int num)
{
	if(num==1)
	{
		return num;
	}
	return num*fact(num-1);
	}
	public static void main(String[] args) {
		P2 obj=new P2();
		
		int num=5; 
		System.out.println(obj.fact(num));	// TODO Auto-generated method stub

	}

}
