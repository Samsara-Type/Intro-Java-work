import java.util.Scanner;


public class Chooseadv 
{
	
	public static void main( String[] args ) 
	{
				Scanner keyboard = new Scanner(System.in); 
				
				String outside, cemetery, pray, ponder, water, tea, store, kitchen, bed, bathroom, phone, shower;
				outside = "outside"; 
				cemetery = "cemetery";
				pray = "pray";
				ponder = "ponder";
				water = "water";
				tea = "tea"; 
				store = "store"; 
				kitchen = "kitchen";
				bed = "bed"; 
				phone = "phone";
				bathroom = "bathroom";
				shower = "shower";
				
				System.out.println( "Hello and welcome to choose your adventure. " );
				
				System.out.println("\n>You wake up in the living room.");
				System.out.println(">Go outside or go to kitchen?");
				String choice = keyboard.next(); 
				
				if (choice.equals(outside)) {
					System.out.println("\n>Some fresh air! You feel relaxed.");
					
					System.out.println(">Will you go to the cemetery or to the store?");
					String cemchoice = keyboard.next(); 
					
						if (cemchoice.equals(cemetery)) {
							System.out.println("\n>You collect your thoughts.");
							
							System.out.println(">Will you pray or ponder?");
							String cemechoice = keyboard.next();
								if (cemechoice.equals(pray)) {
									System.out.println(">Your prayers strengthen your spirituality");
									System.out.println(">Magic increased by 5");
									} 
								if (cemechoice.equals(ponder)) {
									System.out.println(">You think deeply ");
									System.out.println(">Intelligence increased by 5");
									} 
							}
						if (cemchoice.equals(store)) {
							System.out.println("\n>Your feel thirsty");
							
							System.out.println(">You can buy water or tea ");
							String storchoice = keyboard.next(); 
								
								if (storchoice.equals(water)) {
									System.out.println(">You feel refreshed ");
									System.out.println(">Your HP increased 20 ");
								} 
								if (storchoice.equals(tea)) {
									System.out.println(">You feel caffeinated ");
									System.out.println(">Your MP has increased 15");
								}
							} 
					
				}
				
				if (choice.equals(kitchen)) {
					System.out.println("\n>You look around.");
					System.out.println(">There's nothing to eat. Go to bed or shower?");
					String house = keyboard.next();
					
						if (house.equals(bed)) {
							System.out.println("\n>You cant go to bed.");
							System.out.println(">Will you use your phone....or go to the bathroom?");
							String sleep = keyboard.next();
							
								if ( sleep.equals(phone)) {
									System.out.println(">You stare at your phone into the late hours. Eventually you sleep.");
									}
								if (sleep.equals(bathroom)) {
									System.out.println(">You feel disgusted, but you sleep quickly afterwards.");
									System.out.println(">Your strength decreased by 10");
									}
						
							}
									if (house.equals(shower)) {
									System.out.println(">Nothing like a shower to wake up.");
									System.out.println(">HP increased by 10");
										}
					 
						} 
	}					
} 