import java.util.Scanner;

public class Agein5
{
	public static void main(String[] args )
	{

	Scanner keyboard = new Scanner(System.in);

	String yourname;
	int yourage, plusage;
	
	plusage = 5;

		System.out.print( " Hello. What is your name? " );
		yourname = keyboard.next ();

		System.out.print( " Hi, " + yourname + " how old are you? " );
		yourage = keyboard.nextInt ();
		
		System.out.println( " In five years you will be " + (yourage + plusage) + "." );
		System.out.println( "And five years ago you would be " + (yourage - plusage) + ".");
	} 
}
	