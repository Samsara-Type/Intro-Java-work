import java.util.Scanner;

public class Userdata
{
	public static void main( String[] args )
	{

	Scanner keyboard = new Scanner(System.in);

	String firstname, lastname, career, country;
	int grade, age;

	System.out.print( "First Name: " );
	firstname = keyboard.next ();
	
	System.out.print( "Last Name: " );
	lastname = keyboard.next ();

	System.out.print( "Occupation: " );
	career =  keyboard.next ();
	
	System.out.print( "Current Country/State: " );
	country = keyboard.next ();

	System.out.print( "Current grade: " );
	grade = keyboard.nextInt ();

	System.out.print( "Current age: " );
	age = keyboard.nextInt ();

	System.out.println( " First Name: " + firstname + "." );
	System.out.println( " Last Name: " + lastname + "." );
	System.out.println( " Occupation: " + career + "." );
	System.out.println( " Current Country/state: " +country+ "." );
	System.out.println( " Current grade: " + grade + "." );
	System.out.println( " Current age: " + age + "." );
	}
}
	