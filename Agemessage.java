import java.util.Scanner; 


public class Agemessage {

	public static void main ( String[] args ) 
	{
	
	Scanner keyboard = new Scanner(System.in);
	
	String name;
	int age; 
	
	 
	System.out.print("Your name: "); name = keyboard.next();
	System.out.print("Your age: "); age = keyboard.nextInt();
	
		if (age < 16 ) {
			System.out.println("You can't drive, hope you can walk");
		}
		
		if ( age == 16 || age == 17) {
			System.out.println("You should take driving lessons " +name+ ".");
			} 
		if ( age > 25 || age == 25 ) {
			System.out.println("You're old enough for anything " +name+ ".");
		}
		if ( age == 18 || age == 19 || age == 20 || age == 21 || age == 22 || age == 23 || age == 24) {
			System.out.println("Able to vote but not able to rent a car...that doesnt make sense.");
		}
	}
} 	