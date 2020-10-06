//46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.

class Shape {
    int length;
    int height;
    Shape() {
		length=0;
		height=0;
    }
	Shape(int length, int height) {
        this.length = length;
        this.height = height;
    }
	void show() {
        System.out.println("Length: " + length + " height: " + height);
    }
	void Area(){
		
	}

}

class Rectangle extends Shape {
    Rectangle(int length, int height) {
        super(length, height);
    }
    //Overridden
    void Area() {
        super.show();
        System.out.println("Area:  " + (length * height));
    }
    void diagonal() {
        double a = Math.pow(length, 2) + Math.pow(height, 2);
        System.out.println(" Diagonal is: " + (Math.sqrt(a)));
    }
}

class Triangle extends Shape {
    Triangle(int length, int height) {
        super(length, height);
    }
	void Area() {
        super.show();
        System.out.println("Area:  " + (0.5 * length * height));
    }

    
}

public class InstanceOf {
    public static void main(String[] args) {
        Shape sArr[] = { new Rectangle(30, 40), new Triangle(10, 20) };
        sArr[0].Area();
		if(sArr[0] instanceof Rectangle){
			Rectangle r = (Rectangle) sArr[0];
			r.diagonal();
		}else
		{
			System.out.println("Not type of rectange");
		}
		
        sArr[1].Area();

    }

}