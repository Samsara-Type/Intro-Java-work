import java.util.Scanner;

public class Nas
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner (System.in);

		int age, salary; 
		String name;

		System.out.print( "Hello. What is your name?" ); 
		name = keyboard.next ();
		
		System.out.print( "Hi," + name + "! How old are you? " );
		age = keyboard.nextInt (); 

		System.out.print( "So you're " + age + "? Not bad, how much do you make? " );
		salary = keyboard.nextInt ();

		System.out.println( + salary + "? I hope you're careful with your money..." );
	}
}
		
		
