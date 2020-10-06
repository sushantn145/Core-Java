/*01.	Create a class OneBHK with instance variables roomArea, hallArea and price. 
Then create default constructor that initializes instance variables with some 
values and a parameterized constructor that takes values for all instance 
variables and stores them in instance variables. Now create a method named show()  
to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of 
OneBHK and a new instance variable room2Area. Then create default constructor to initialize 
all 4 instance variables and a parameterized constructor to take the values for initialization
 of all instance variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and 
print information using show method. Also print total amount of all flats. */

import java.util.Scanner;
class OneBHK{
    private float roomArea;
    private float hallArea;
    private float price;

    OneBHK(){
        this.roomArea=0;
        this.hallArea=0;
        this.price=0;
    }
    OneBHK(float roomArea,float hallArea,float price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show(){
        System.out.println("roomArea :"+roomArea+" hallArea :"+hallArea+" price :"+price);
    }
    float getprice(){
        return this.price;
    }
}
class TwoBHK extends OneBHK{
    private float room2Area;
    TwoBHK(){
        super();
        this.room2Area=0;
    }
    TwoBHK(float roomArea,float hallArea,float price,float room2Area){
        super(roomArea,hallArea,room2Area);
        this.room2Area=room2Area;
    }
    void show(){
        super.show();
        System.out.println("room2Area : "+room2Area);
    }
}

class DemoBHK{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        TwoBHK arr[] = new TwoBHK[3];
        System.out.println("Enter Details");
        for(int i=0;i<3;i++){
			System.out.print("Enter room area for 1BHK : ");
			float roomArea=sc.nextFloat();
			System.out.print("Enter room area for 2BHK : ");
			float room2Area=sc.nextFloat();
			System.out.print("Enter hall area for 1BHK : ");
			float hallArea=sc.nextFloat();
			System.out.print("Enter price : ");
			float price=sc.nextFloat();
			arr[i]=new TwoBHK(roomArea,hallArea,price,room2Area);
			System.out.println("-------------------------");
        }
        double sum=0;
        for(TwoBHK a : arr){
            a.show();
            sum+=a.getprice();
        }
        System.out.println("Total Price  : "+sum);
    }
}