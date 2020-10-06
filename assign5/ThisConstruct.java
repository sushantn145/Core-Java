//41.	Write a program to demonstrate this() construct functionality.

class Person{
    private String name;
    private int age;
    Person(int age){
        this.age=age;
        System.out.println("age const args");
    }

    Person(String name,int age){
        this(age);
        this.name=name;
    }

    void getage(){
        System.out.println("Age "+age);
    }
    void show(){
        this.getage();
        System.out.println(name);
    }
}


class ThisConstruct{
    public static void main(String args[]){
        Person p = new Person("sushant",25);
        p.show();
    }
}