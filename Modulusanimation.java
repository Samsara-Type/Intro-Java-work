public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		
		for ( int i=0; i<80; i++ )
		{
			if ( i%16 == 0 )
				System.out.print(" ..Josh-is-cool.. \r");
			else if (i%16 == 1)
				System.out.print(" ...Josh-is-cool. \r");
			else if (i%16 == 2)
				System.out.print(" ....Josh-is-cool \r");
			else if (i%16 == 3)
				System.out.print(" l....Josh-is-coo \r");
			else if (i%16 == 4)
				System.out.print(" ol....Josh-is-co \r");
			else if (i%16 == 5)
				System.out.print(" ool....Josh-is-c \r");
			else if (i%16 == 6)
				System.out.print(" cool....Josh-is- \r");
			else if (i%16 == 7)
				System.out.print(" -cool....Josh-is \r");
			else if (i%16 == 8)
				System.out.print(" s-cool....Josh-i \r");
			else if (i%16 == 9)
				System.out.print(" is-cool....Josh- \r");
			else if (i%16 == 10)
				System.out.print(" -is-cool....Josh \r");
			else if (i%16 == 11)
				System.out.print(" h-is-cool....Jos \r");
			else if (i%16 == 12)
				System.out.print(" sh-is-cool....Jo \r");
			else if (i%16 == 13)
				System.out.print(" osh-is-cool....J \r");
			else if (i%16 == 14)
				System.out.print(" Josh-is-cool.... \r");
			else if (i%16 == 15)
				System.out.print(" .Josh-is-cool... \r");
			else if (i%16 == 16)
				System.out.print(" ..Josh-is-cool.. \r");
			
			Thread.sleep(200);
		}
		
	}
}