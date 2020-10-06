/*12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, 
then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or 
above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input 
by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/

import java.util.Scanner;
class Q12{
	public static void main(String... args){
		int basicsal,hra,da,gs;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		basicsal = sc.nextInt();
		System.out.println("Enter HRA");
		hra = sc.nextInt();
		System.out.println("Enter DA");
		da = sc.nextInt();
		
		if (basicsal<10000){
			hra = (basicsal*10)/100;
			da = (basicsal*90)/100;
			System.out.println("When Basic salary is less than Rs.10000");
			gs = basicsal+hra+da;
			System.out.println("Gross Salary = "+gs);
		}else{
			hra = 2000;
			da = (basicsal*98)/100;
			System.out.println("When Basic salary is equal or above tha Rs.10000");
			gs = basicsal+hra+da;
			System.out.println("Gross Salary = "+gs);
		}
	}
}