/*48.	Create an Abstract class Processor with int member variable data  
and method showData to display data value.Create abstract method process() 
to define processing of member data. Create a class  Factorial using 
abstract class Processor  to calculate and print factorial of a number by
overriding the process method. 
b. Create a class Circle using abstract class Processor
to calculate and print area of a circle by overriding the process method.Ask user to enter 
choice (factorial or circle area).  Also ask data to work upon. Use Processor class reference 
to achieve this mechanism.
*/
import java.util.Scanner;
abstract class Process{
    int data;

    abstract void process();

    void showData(){
        System.out.println("Data : "+data);
    }
}

class Factorial extends Process{
    void process(){
        int n=5;
        int sum=1;
        for(int i=1;i<=n;i++){
            sum = sum*i;
        }
        data = sum;
    }
}

class Circle extends Process{
    public void process(){
        double PI =3.14;
        int r=5;
        double area;
        area = PI * r *r;
        data = (int)area; 
    }
}

class AbstractClass{
    public static void main(String args[]){
        // Process p = new Factorial();
        // Process p1 = new Circle();
        // p.process();
        // p1.process();
        // p.showData();
        // p1.showData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice  Number\n 1)Factorial \n 2)Circle");
        int n = sc.nextInt();
        switch(n){
            case 1:
                Process p = new Factorial();
                p.process();
                p.showData();
                break;
            case 2:
                Process p1 = new Circle();
                p1.process();
                p1.showData();
                break;
            default :
                System.out.println("Enter choice 1 or 2 ");
        }
        
    }
}