import java.util.Scanner;

public class Bmicalc
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		double kilo, meter, bmi;

		System.out.print( "Your height in m: " );
		meter = keyboard.nextDouble ();
	
		System.out.print( "Your weight in kg: " );
		kilo = keyboard.nextDouble ();

		bmi = kilo / ( meter * meter ); 

		System.out.println( "Your BMI is " + bmi + " ");
	}
}

		