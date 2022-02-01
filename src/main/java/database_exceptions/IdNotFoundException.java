package database_exceptions;
public class IdNotFoundException extends Exception{
	String s;
	public IdNotFoundException(String s){
		super(s);
	}
	
}
