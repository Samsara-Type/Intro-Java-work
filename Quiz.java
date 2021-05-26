import java.util.Scanner;

public class Quiz
{
		public static void main( String[] args )
		{
		
		   Scanner keyboard = new Scanner (System.in);
			
		   String name;
		   int ans, answer, answered, answers, result;
			
			
			System.out.println( "Hello are you ready for the test? \nPlease give me your name. " );
			name = keyboard.next ();
			
			System.out.println( "Alright " + name + ". what is the capital of Japan? " );
			System.out.println( " " + 1 + ") Seoul ");
			System.out.println( " " + 2 + ") Hiroshima ");
			System.out.println( " " + 3 + ") Tokyo " );
			
			ans = keyboard.nextInt ();
			
			if ( ans != 3 ) {
				System.out.println( "\nSorry that was incorrect " );
			}
			if ( ans == 3 )
			{
				System.out.println( "Correct, that is the capital! " );
			}
			
			System.out.println( "Next question. Who should you trust?");
			System.out.println( " " + 1 + ") The government " );
			System.out.println( " " + 2 + ") Your shitty friends" );
			System.out.println( " " + 3 + ") Yourself " );
			
			answer = keyboard.nextInt (); 
			
			if ( answer != 3 ) {
				System.out.println( "Think a bit harder on this one... " );
			}
			
			if ( answer == 3 )
			{
				System.out.println( "Correct, dont forget it! " );
			}
			
			System.out.println( "Final Question. What year is it? ");
			System.out.println( "" + 1 + ") 2008 ");
			System.out.println( "" + 2 + ") 1948");
			System.out.println( "" + 3 + ") 2021 ");
			
			answered = keyboard.nextInt ();
			
			if ( answered != 3) {
				System.out.println( "Sorry that was incorrect " );
			}
			
			if ( answered == 3 )
			{
				System.out.println( "Not bad, correct.");
			}
			
			
			result = answered + ans + answer;
			
			if ( result == 9 )
			{
				System.out.println( "Congrats you got all of them correct!");
			}
			
			else if ( result == 8 )
			{	
				System.out.println( "Try a little better next time. You only got 2 correct.");
			} 
			else if ( result == 7 )
			{	
				System.out.println( "Try a little better next time. You only got 2 correct.");
			}
			else if  ( result < 7 )
			{
				System.out.println( "You can do better than that.");
			}
			
			
			
			
			 
		}
	
}
		