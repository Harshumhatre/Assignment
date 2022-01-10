package CustomExceptionBank;

public class MyCustomException extends RuntimeException{
String message;

public MyCustomException(String message) {
	super(message);
	
}

}
