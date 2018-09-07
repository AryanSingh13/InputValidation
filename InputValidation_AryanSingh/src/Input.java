
/**
 * AP CmpSci 2018-2019
 * Input Validation
 * The Input class performs input validation of a variety of numerical inputs.
 * 
 * @author Aryan Singh
 * @version August 24, 2018
 */
import java.util.Scanner;

public class Input 
{
	/** A scanner that takes input from the system. */
	static Scanner sc = new Scanner( System.in );
	
	/**
	 * One argument Input constructor 
	 * @param reader The scanner used to read inputs for the class.
	 */
	public Input(Scanner reader)
	{
		Input.sc = reader;
	}
	
	/**
	 * The readInt method reads a valid integer that is input through a scanner.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @return The value in the number field.
	 */
	public static int readInt( String prompt )
	{
		int number;
		
	    while (!sc.hasNextInt()) 
	    {
	        System.out.println(prompt);
	        sc.next();
	    }
	    number = sc.nextInt();
	    
	    return number;
	}
	
	/**
	 * The readDouble method reads a valid double that is input through a scanner.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @return The value in the number field.
	 */
	public static double readDouble( String prompt )
	{
		double number;
		
	    while (!sc.hasNextDouble()) 
	    {
	        System.out.println(prompt);
	        sc.next();
	    }
	    number = sc.nextDouble();
	    
	    return number;
	}
	
	/**
	 * The readNum method reads in a valid integer that is less than or equal to the value that is the maximum parameter.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @param max The maximum integer that can be read by this method.
	 * @return The value in the number field.
	 */
	public static int readNum( String prompt, int max )
	{
		int number;
		
		while( true )
		{
			while (!sc.hasNextInt()) 
		    {
		        System.out.println(prompt);
		        sc.next();
		    }
		    number = sc.nextInt();
		    
		    if ( number <= max )
		    {
				return number;
		    }
		    else
		    {
		    	System.out.println(prompt);
		    	continue;
		    }
		}
	}
	
	/**
	 * The readNum method reads in a valid integer that is greater than or equal to the value that is the minimum parameter.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @param min The minimum integer that can be read by this method.
	 * @return The value in the number field.
	 */
	public static int readNum( int min, String prompt )
	{
		int number;
		
		while( true )
		{
			while (!sc.hasNextInt()) 
		    {
		        System.out.println(prompt);
		        sc.next();
		    }
		    number = sc.nextInt();
		    
		    if ( min <= number )
		    {
				return number;
		    }
		    else
		    {
		    	System.out.println(prompt);
		    	continue;
		    }
		}
	}
	
	/**
	 * The readNum method reads in a valid integer that is between the values specified by the minimum parameter and maximum parameter, inclusive.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @param min The minimum integer that can be read by this method.
	 * @param max The maximum integer that can be read by this method.
	 * @return The value in the number field.
	 */
	public static int readNum( String prompt, int min, int max )
	{
		int number;
		
		while( true )
		{
			while (!sc.hasNextInt()) 
		    {
		        System.out.println(prompt);
		        sc.next();
		    }
		    number = sc.nextInt();
		    
		    if ( min <= number && number <= max )
		    {
				return number;
		    }
		    else
		    {
		    	System.out.println(prompt);
		    	continue;
		    }
		}
	}
	
	/**
	 * The readNum method reads in a valid double that is less than or equal to the value that is the maximum parameter.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @param max The maximum double that can be read by this method.
	 * @return The value in the number field.
	 */
	public static double readNum( String prompt, double max )
	{
		double number;
		
		while( true )
		{
			while (!sc.hasNextDouble()) 
		    {
		        System.out.println(prompt);
		        sc.next();
		    }
		    number = sc.nextDouble();
		    
		    if ( number <= max )
		    {
				return number;
		    }
		    else
		    {
		    	System.out.println(prompt);
		    	continue;
		    }
		}
	}
	
	/**
	 * The readNum method reads in a valid double that is greater than or equal to the value that is the minimum parameter.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @param min The minimum double that can be read by this method.
	 * @return The value in the number field.
	 */
	public static double readNum( double min, String prompt )
	{
		double number;
		
		while( true )
		{
			while (!sc.hasNextDouble()) 
		    {
		        System.out.println(prompt);
		        sc.next();
		    }
		    number = sc.nextDouble();
		    
		    if ( min <= number )
		    {
				return number;
		    }
		    else
		    {
		    	System.out.println(prompt);
		    	continue;
		    }
		}
	}
	
	/**
	 * The readNum method reads in a valid double that is between the values specified by the minimum parameter and maximum parameter, inclusive.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @param min The minimum double that can be read by this method.
	 * @param max The maximum double that can be read by this method.
	 * @return The value in the number field.
	 */
	public static double readNum( String prompt, double min, double max )
	{
		double number;
		
		while( true )
		{
			while (!sc.hasNextDouble()) 
		    {
		        System.out.println(prompt);
		        sc.next();
		    }
		    number = sc.nextDouble();
		    
		    if ( min <= number && number <= max )
		    {
				return number;
		    }
		    else
		    {
		    	System.out.println(prompt);
		    	continue;
		    }
		}
	}
	
	/**
	 * The readNum method reads in a valid integer than is either greater than the value of the limit field, if the minMax value is true, or less, if the the minMax value is false.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @param limit The double value that represents either the minimum or maximum value, depending on the boolean value of minMax.
	 * @param minMax The boolean that determines whether the limit represents the minimum acceptable double, if true, or the maximum, if false.
	 * @return The value in the number field.
	 */
	public static int readNum( String prompt, int limit, boolean minMax )
	{
		int number = 0;
		
		if( minMax )
		{
			while( true )
			{
				while (!sc.hasNextInt()) 
			    {
			        System.out.println(prompt);
			        sc.next();
			    }
			    number = sc.nextInt();
			    
			    if ( limit <= number )
			    {
					return number;
			    }
			    else
			    {
			    	System.out.println(prompt);
			    	continue;
			    }
			}
		}
		if( !minMax )
		{
			while( true )
			{
				while (!sc.hasNextInt()) 
			    {
			        System.out.println(prompt);
			        sc.next();
			    }
			    number = sc.nextInt();
			    
			    if ( number <= limit )
			    {
					return number;
			    }
			    else
			    {
			    	System.out.println(prompt);
			    	continue;
			    }
			}
		}
		
		return number;
	}
	
	/**
	 * The readNum method reads in a valid double than is either greater than the value of the limit field, if the minMax value is true, or less, if the the minMax value is false.
	 * @param prompt The message that is written in the console in the event of an invalid input.
	 * @param limit The integer value that represents either the minimum or maximum value, depending on the boolean value of minMax.
	 * @param minMax The boolean that determines whether the limit represents the minimum acceptable integer, if true, or the maximum, if false.
	 * @return The value in the number field.
	 */
	public static double readNum( String prompt, double limit, boolean minMax )
	{
		double number = 0;
		
		if( minMax )
		{
			while( true )
			{
				while (!sc.hasNextDouble()) 
			    {
			        System.out.println(prompt);
			        sc.next();
			    }
			    number = sc.nextDouble();
			    
			    if ( limit <= number )
			    {
					return number;
			    }
			    else
			    {
			    	System.out.println(prompt);
			    	continue;
			    }
			}
		}
		if( !minMax )
		{
			while( true )
			{
				while (!sc.hasNextDouble()) 
			    {
			        System.out.println(prompt);
			        sc.next();
			    }
			    number = sc.nextDouble();
			    
			    if ( number <= limit )
			    {
					return number;
			    }
			    else
			    {
			    	System.out.println(prompt);
			    	continue;
			    }
			}
		}
		
		return number;
	}
}
