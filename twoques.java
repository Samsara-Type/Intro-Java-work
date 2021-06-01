import java.util.Scanner; 

public class twoques {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
	
		String inside, outside, both, alive, dead, houseplant, bison, dog, phone, yes, no;
	
		inside = "inside";
		outside = "outside";
		both = "both";
		yes = "yes";
		no = "no";
		houseplant = "houseplant";
		bison = "bison";
		dog = "dog";
		phone = "phone";
	
	
	System.out.println("Think of something and I'll try to guess it.");
	
	System.out.print("\nQuestion 1) Does it stay inside, outside or both? ");  
		String ans = keyboard.next(); 
	 
			System.out.print("Question 2) Is it alive? "); String anst = keyboard.next();
			
			if (ans.equals(inside) && anst.equals(yes)) {
				System.out.println("Sounds like a houseplant"); 
			}
			if (ans.equals(inside) && anst.equals(no)) {
				System.out.println("Is it a shower curtain?");
			}
			if (ans.equals(outside) && anst.equals(yes)) {
				System.out.println("My guess is...a bison!");
			} 
			if (ans.equals(outside) && anst.equals(no)) {
				System.out.println("Could it be a billboard?"); 
			}
			if (ans.equals(both) && anst.equals(yes)) {
				System.out.println("Maybe its a dog?"); 
			}
			if (ans.equals(both) && anst.equals(no)) {
				System.out.println("Is it a cell phone?");
			}
	
	} 
} 
	