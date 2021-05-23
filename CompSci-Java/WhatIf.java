public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15; 

		if ( people < cats )
		{
			System.out.println( "Too many catgirls! The world is saved!" );
		}
	
		if ( people > cats )
		{
			System.out.println( " Not enough nekogirls! the world is doomed! " );
		}
		
		if ( people < dogs )
		{
			System.out.println( " Too many Pitbulls " );
		}

		if ( people > dogs )
		{
			System.out.println( " The World is dry!" );
		}
	
		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		//the if statement is a statement that tells the computer to execute different lines depending on criteria met.
		//the curly braces open and close the if statement so new ones can be used 
		}
	}
}