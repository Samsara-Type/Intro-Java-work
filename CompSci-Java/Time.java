public class Time
{
	public static void main( String[] args )
	{
		int minute, hour, second;

		 minute = 22;
		 hour = 15;
		 second = 49;
		
		System.out.print( "Seconds since midnight:" );
		System.out.println( second + ( minute * 60) + ( hour + 3600));
		System.out.print( "Percent of the day that has passed:" );
		System.out.println( hour * 100 / 24);
		System.out.print( "Seconds left today:" );
		System.out.println( 86400 - (second +( minute * 60) + ( hour + 3600 )));
		//86400 seconds in a day
		//4984 seconds so far.
	}
}