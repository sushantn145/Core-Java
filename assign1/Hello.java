import java.util.Scanner;
import java.lang.Math;
//01.	Write a program to print Hello World. Compile and run it using command prompt

public class Hello{
	public static void main(String... args){
		System.out.println("Hello World");
	}
}
//02.	Write a program to declare a variable named rollNo of integer type. 
//      Assign it a value (let say 100) to it and print the following statement roll no = 100 .
class Rollno{
	public static void main(String... args){
		int rollno=100;
		System.out.println("Roll No = "+rollno);
	}
}

/*03.	Find the result of following expressions. You need to determine the primitive data type of the 
variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

class Expr{
	public static void main(String args[]){
		System.out.println("Enter the no.");
		int x=2;
		int y = x*x + 3*x -7;
		System.out.println("=================");
		System.out.println("Value of y = "+y);
		y = x++ + ++x;
		System.out.println("=================");
		System.out.println("Value of x ="+x);
		System.out.println("Value of y ="+y);
		int z = x++ - --y - --x + x++;
		System.out.println("=================");
		System.out.println("Value of y ="+x);
		System.out.println("Value of x ="+y);
		System.out.println("Value of y ="+z);
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = b1 && b2 || !(b1 || b1);
		System.out.println("=================");
		System.out.println("Value of y ="+b3);
		
	}
}



