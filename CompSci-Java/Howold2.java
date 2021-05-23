import java.util.Scanner;

public class Howold2
{
	public static void main( String[] args )
	{
		
		Scanner keyboard = new Scanner(System.in);

		String yourname;
		int yourage;
		
		System.out.print( "Hey, whats your name? ");
		yourname = keyboard.next ();
		
		System.out.print( "Ok " + yourname + " how old are you? ");
		yourage = keyboard.nextInt ();
		
		if ( yourage < 16 )
		{
				System.out.println( " Seems you cant legally drive yet." );
		}
		else if( yourage == 16 )
		{
				System.out.println( " You can drive but not vote");
		}
		else if ( yourage == 17 )
		{
				System.out.println( " You can drive but not vote. " );
		}
		else if ( yourage > 18 )
		{
			System.out.println( "You can vote but not rent a car.");
		}
		else if( yourage == 18)
		{
				System.out.println( "You can vote but not rent a car");
		}
		else if ( yourage < 25)
		{
			System.out.println( " You can vote but not rent a car");
		}
		if ( yourage > 25 )
		{
				System.out.println( " Hopefully, you're a fully blown adult now. ");
		}
		if ( yourage == 25 )
		{
				System.out.println( " Hopefully, you're a fully blown adult now. ");
		}
	}
} 
		
		