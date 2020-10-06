/*39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor
 that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate
 and return total amount spent on all products. 
 ( amount spent on single product = price of product * quantity of product )
 */

 import java.util.Scanner;
class Product{
    private int pid;
    private int price;
    private int quantity;
    private static int maxPrice=0;
    private static int maxPid=0;
    

    Product(int pid,int price,int quantity){
        if(price > maxPrice){
            maxPid = pid;
            maxPrice = price;
        }
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public static void maxPricePid(){
        System.out.println("Max price PID : "+maxPid);
    }

    public static void totalAmountSpent(Product arr[]){
        int totalAmount = 0;
        for(Product ar : arr){
            totalAmount =  ar.price * ar.quantity;
            System.out.println("pid : "+ar.pid+"  "+"totalAmount : "+totalAmount);
        }
    }
    void show(){
        System.out.println("pid : "+pid+" "+"price : "+price+" "+"quantity : "+quantity);
    }
}
class ProductDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Product arr[] = new Product[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the pid");
            int pid = sc.nextInt();
            System.out.println("Enter the price");
            int price = sc.nextInt();
            System.out.println("Enter the quantity");
            int quantity = sc.nextInt();
            Product p = new Product(pid,price,quantity);
            arr[i] = p;
        }
        for(Product ar : arr){
            ar.show();
        }
        System.out.println();
        Product.maxPricePid();
        System.out.println();
        Product.totalAmountSpent(arr);    
        
    }
}