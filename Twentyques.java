import java.util.Scanner;

public class Twentyques 
{

	public static void main( String[] args ) 
	{
		Scanner keyboard = new Scanner(System.in); 
		
	
		String animal, vegtable, mineral, yes, no;
		animal = "animal";
		vegtable = "vegtable";
		mineral = "mineral";
		yes = "yes"; 
		no = "no";
		
	
	
		System.out.println("Two Questions!");
		System.out.println("Think of an object, and I'll try to guess it."); 
		
		System.out.println("\nQuestion 1) Is it animal ,vegtable or mineral? ");
		String form = keyboard.next ();  
		
				
			if (form.equals(animal) ) {
				System.out.println("\nQuestion 2) Is it bigger than a breadbox?");
				String size = keyboard.next();
					if (size.equals(yes) ) {
						System.out.println("Sounds like it may be a moose.");
						} 
						else if (size.equals(no) ) {
							System.out.println("Could it be a squirrel?");
						}
				} 
						if (form.equals(vegtable) ) {
							System.out.println("\nQuestion 2) Is it bigger than a breadbox?");
							String size = keyboard.next();
								if (size.equals(yes) ) {
									System.out.println("It must be a watermelon.");
								}
									else if (size.equals(no) ) {
										System.out.print("It's a carrot.");
									}
						} 
						else if (form.equals(mineral) ) {
							System.out.println("\nQuestion 2) Is it bigger than a breadbox?");
							String size = keyboard.next();
								if (size.equals(yes) ) {
									System.out.println("My guess would be a camaro.");
								}
									else if (size.equals(no) ) {
										System.out.println("My guess is it must be a paper clip.");
									}
							}
						
					
				
				
			
		 
	}	
} 	
			
			
		
		