

	// ***********************************************
	// BaseConvert.java
	//
	// Converts base 10 numbers to another base
	// (at most 4 digits in the other base). The
	// base 10 number and the base are input.
	// ***********************************************
	import java.util.Scanner;
	public class baseConversions {
	
	public static void main (String[] args)
	{
	int base; // the new base
	int base10Num; // the number in base 10
	int maxNumber; // the maximum number that will fit
				// in 4 digits in the new base
	int place0; // digit in the 1's (base^0) place
	int place1; // digit in the base^1 place
	int place2; // digit in the base^2 place
	int place3; // digit in the base^3 place
	int quotient;
	String baseBNum = new String (""); // the number in the new base
	Scanner scan = new Scanner(System.in); // read in the base 10 number and the base
	
	System.out.println();
	System.out.println ("Base Conversion Program");
	System.out.println();
	System.out.print ("Please enter a base (2-9): ");
	base = scan.nextInt();
											// Compute the maximum base 10 number that will fit in 4 digits
	maxNumber = (int)Math.pow(base, 4) - 1;// in the new base and tell the user what range the number they
	System.out.println ("The maximum base 10 number you can enter is: " + maxNumber);			// want to convert must be in
	
	System.out.print ("Please enter a base 10 number to convert: ");
	base10Num = scan.nextInt();
	
	place0 = base10Num % base;
	quotient = base10Num / base;
	place1 = quotient % base;
	quotient = quotient / base;
	place2 = quotient % base;
	quotient = quotient / base;
	place3 = quotient % 3;
	
	baseBNum = ""+place3 + ""+place2 + ""+place1 + ""+place0;
	
	System.out.println ("When a base 10 number: " + base10Num + " is converted to base " + base + "," +
	" The base " + base + " value is: " + baseBNum);
	scan.close();
	
	// Do the conversion (see notes in lab)
	
	// Print the result (see notes in lab)
	}
	}
	

