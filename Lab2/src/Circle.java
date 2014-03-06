
// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
public class Circle
{
public static void main(String[] args)
{

final double PI = 3.14159;
int radius = 10;
double area1 = PI * radius * radius;
double area2 = PI * radius * radius;
double area3 = area2 / area1;
double circumference1 = PI * radius * 2;
double circumference2 = PI * radius * 2;
double circumference3 = circumference2 / circumference1;

System.out.println("The area of a circle with radius " + radius +
" is " + area1 + "," + " The circumference is " + circumference1);

radius = 20;
area2 = PI * radius * radius;
circumference2 = PI * radius * 2;

System.out.println("The area of a circle with radius " + radius +
" is " + area2 + "," + " The circumference is " + circumference2);

area3 = area2 / area1;
circumference3 = circumference2 / circumference1;

System.out.println("The factor that the area grew is " + area3 + 
" The factor that the circumference grew is " + circumference3);
}
}
