import java.util.Scanner;
public class Idealweight1 {

	public static void main (String[] args)
	{
int feet,inches;
	Scanner scan = new Scanner(System.in);
		System.out.println ("What is your height in feet?");
		feet = scan.nextInt();
		System.out.println ("What is your height in inches?");
		inches = scan.nextInt();
	
	double ft2in = (feet - 5) * 12;
	double mweight = 6 * inches;
	double fweight = 5 * inches;
	double fweight2 = ft2in *5;
	double mweight2 = ft2in * 6;
	double midealwt;
	double fidealwt;
	if (feet < 5 )
	{
		double small5 = (60 - (feet*12 + inches)) * 2;
		midealwt = 106 - small5;
		fidealwt = 100 - small5;
	}
	
	else
	{
	 midealwt = 106 + mweight + mweight2;
	 fidealwt = 100 +	fweight + fweight2;
	}
		
		System.out.println("If you are a female, your ideal weight is " + fidealwt + "," 
		+ " Although your weight is fine if it's between " + (fidealwt-(fidealwt * 0.15)) + " and " 
		+ (fidealwt+(fidealwt * 0.15)));
		
		System.out.println ("If you are a male, your ideal weight is " + midealwt + "," 
		+ " Although your weight is fine if it's between " + (midealwt-(midealwt * 0.15))
		+ " and " + (midealwt+(midealwt * 0.15)));
		
	
}
}
	
