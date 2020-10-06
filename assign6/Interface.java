/*49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
create abstract method calcTax(). 
a. Create class Employee(empId,name,salary)and implement Taxable to calculate incomeTax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. 
c. Create class for main method(Say XYZ), accept employee information and a product information 
from user and print income tax and sales tax respectively.
*/
import java.util.Scanner;
interface Taxable{
    double salesTax = 0.7;//all interface variable == public static final 
    double incomeTax = 0.105;

    void calcTax();//interface method is abstract & public 
    static void m1(){};
}

class Employee implements Taxable{
    int empId;
    String name;
    int salary;
    Employee(){};
    Employee(int empId,String name,int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public void calcTax(){  //need to give public bcoz by default all method in class is default.
        double TotalIncomeTax = salary*incomeTax;
        System.out.println("IncomeTax : "+TotalIncomeTax);
    }
}

class Product implements Taxable{
    int pid;
    double price;
    int quantity;

    Product(){};
    Product(int pid,double price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax(){
        double TotalSalesTax = price*quantity*salesTax;
        System.out.println("TotalSalesTax : "+TotalSalesTax);
    }
}

class Interface{
    protected static void main(String args[]){
        Taxable e = new Employee(101,"Sushant",9000);
        Taxable p = new Product(102,50,5);
        
        e.calcTax();
        p.calcTax();
    }
}