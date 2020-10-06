/*38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls 
Employee method to display no. of employees and total of their salaries.
*/
import java.util.Scanner;
class Employee{
    private static int empNo;
    private int salary;
    private static int totalSalary;

    Employee(){
        this.empNo=0;
        this.totalSalary =0;
    }
    Employee(int salary){
        this.empNo++;
        this.salary =salary;
        this.totalSalary = totalSalary+salary;
    }

    void show(){
        System.out.println("empNo : "+empNo+"  "+"Salary : "+salary+"  "+"TotalSalary : "+totalSalary);
    }
}

class EmployeeDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Employee e =  new Employee();
        e.show();
        Employee e1 = new Employee(5000);
        e1.show();
        Employee e2 = new Employee(5000);
        e1.show();
        // int arr[] = new int[3];
        
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        //     Employee e1 = new Employee(arr);
        //     e1.show();
        // }
        /*for(int a : arr){
            e1.show();
        }*/
    }
}
