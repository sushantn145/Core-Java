//47.	Create a program to demonstrate constructor chaining.
class Person{
    Person(){
        System.out.println("no-args Person");
    }
    Person(int a){
        System.out.println("1 args Person");
    }
}
class Employee extends Person{
    Employee(){
        System.out.println("No-args Employee");
    }
    Employee(int a){
        super(a);
        System.out.println("1 args Employee");
    }
}

class ConstructorChain{
    public static void main(String args[]){
        Person e= new Employee();
        Person e1 =new Employee(10);
    }
}