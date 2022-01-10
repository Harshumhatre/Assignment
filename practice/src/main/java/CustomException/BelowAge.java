package CustomException;

public class BelowAge extends RuntimeException{
String message;

public BelowAge(String message) {
	super(message);
}

}
