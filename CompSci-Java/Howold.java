import java.util.Scanner; 

public class Howold
{
	public static void main( String[] args )
	{

		Scanner keyboard = new Scanner(System.in);

		int age1;
		String name1;


		System.out.print( " What is your name? " );
		name1 = keyboard.next ();

		System.out.print( " Alright " + name1 + ", how old are you? " );
		age1 = keyboard.nextInt ();
		
		if ( age1 > 21 )
		{
			System.out.println( " Don't drink yourself to death. " );
		}
		
		if ( age1 > 21 ) 
		{
			System.out.println( " Also work hard and dont stop, you'll regret wasting your time. " );
		}

		if ( age1 < 21 )
		{
			System.out.println( " Make sure not to get obsessed playing video games or something, go outside. " );
		}

		if ( age1 < 21 )
		{
			System.out.println( " Dont worry about trying to seem cool to people either. " );
		}

		if ( age1 == 21 )
		{
			System.out.println( " Be careful. " );
		}

	}
}
		
