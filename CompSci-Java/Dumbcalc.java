import java.util.Scanner;

public class Dumbcalc
{
	public static void main( String[] args )
	{

	Scanner keyboard =  new Scanner(System.in);
	
	int one, two, three, four;
	

	System.out.print( "What is your first number? " );
	one = keyboard.nextInt ();

	System.out.print( "What is your second number? " );
	two = keyboard.nextInt ();

	System.out.print( "What is your third number? " );
	three = keyboard.nextInt ();

	four = ( one + two + three ) / 2;
	
	System.out.println("( " +one+ " + " +two+ " + " +three+ " ) / 2 is... " +four+ "."); 
	}
}
