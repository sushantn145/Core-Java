/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of 
Person class by creating Person object and calling methods.
*/

import java.util.Scanner;
class Person{
    private int age;
    private String name;

    Person(){
        age = 28;
    }
    Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    void show(){
        System.out.println("Name : "+name +"  "+"age : "+age);
    }
}

class PersonDemo{
    static public void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Person p =  new Person();
        p.show();
        for(int i=0;i<3;i++){
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter Age");
            int age = sc.nextInt();
            Person p1 = new Person(name,age);
            p1.show();
        }
    }
}

