
import java.util.Scanner;
public class Circle2 {
	
public static void main(String[] args)
{

int radius;

	
Scanner scan = new Scanner(System.in);
System.out.print ("Enter a value for the Radius:" );
radius = scan.nextInt();

double radius1 = radius * 2;
final double PI = 3.14159;
double area1 = PI * radius * radius;
double area2 = PI * radius1 * radius1;
double area3 = area2 / area1;
double circumference1 = PI * radius * 2;
double circumference2 = PI * radius1 * 2;
double circumference3 = circumference2 / circumference1;




System.out.println("The area of a circle with radius " + radius +
" is " + area1 + "," + " The circumference is " + circumference1);

radius1 = radius * 2;
area2 = PI * radius1 * radius1;
circumference2 = PI * radius1 * 2;

System.out.println("The area of a circle with radius " + radius1 +
" is " + area2 + "," + " The circumference is " + circumference2);

area3 = area2 / area1;

circumference3 = circumference2 / circumference1;
System.out.println("The factor that the area grew is " + area3 + 
" The factor that the circumference grew is " + circumference3);
}
}

