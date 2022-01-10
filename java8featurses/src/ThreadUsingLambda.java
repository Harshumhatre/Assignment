import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadUsingLambda<E> extends Thread {
public void run()
{ 
	try {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7);
		asList.forEach(i -> System.out.println(i));
		
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
	
}
public static void main(String[] args) {
	ThreadUsingLambda threadUsingLambda = new ThreadUsingLambda();
	threadUsingLambda.start();
}
}
