/*34.	Create a class Circle that has two data members, one to store the radius and 
another to store area and three methods first init() method to input radius from
user, second calculateArea() method to calculate area of circle and third display()
method to display values of radius and area. Create class CircleDemo ( main class) 
that creates the Circle object and calls init(), calculateArea() and display() methods.
*/
import java.util.Scanner;
class Circle{
    private float area;
    private int radius;

    void init(int radius){
        this.area = area;
        this.radius = radius;
    }

    void calculateArea(int radius){
        float pi=3.14F;
        this.area = pi*radius*radius;
    }
    void show(){
        System.out.println("area = "+area);
        System.out.println("radius = "+radius);
    }

}
class ArrayObject{
    static public void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        Circle  c =new Circle();
        c.init(radius);
        c.calculateArea(radius);
        c.show();

    }
}

