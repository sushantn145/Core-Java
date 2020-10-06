//15.	Accept person’s gender (character m for male and f for female), age (integer), 
//as input and then check whether person is eligible for marriage or not.

import java.util.Scanner;
class Q15{
	public static void main(String []args){
		char ch;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender");
		ch = sc.next().charAt(0);
		System.out.println("Enter Gender"+ch);
		System.out.println("Enter Age");
		age = sc.nextInt();
		
		if((ch=='M'&& age>=21)){
			System.out.println("He is Eligible for Marriage");
		} 
		else if((ch=='F'&& age>=18)){
			System.out.println("She is Eligible for Marriage");
		}
		else{
			System.out.print("Not Eligible for Marriage");
		}
	}
}