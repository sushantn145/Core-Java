/*35.	Create a class MathOperation that has four static methods. add() 
method that takes two integer numbers as parameter and returns the sum of the numbers. 
subtract() method that takes two integer numbers as parameter and returns the difference 
of the numbers. multiply() method that takes two integer numbers as parameter and returns 
the product. power() method that takes two integer numbers as parameter and returns the power 
of first number to second number.Create another class Demo (main class) that takes the two numbers
from the user and calls all four methods of MathOperation class by providing entered numbers and prints 
the return values of every method. 
*/

import java.util.Scanner;
class MathOperation{

    static int add(int num1,int num2){
        return num1+num2;
    }
    static int subtract(int num1,int num2){
        return num1-num2;
    }
    static int multiply(int num1 ,int num2){
        return num1*num2;
    }
    static int power(int num1, int num2){
        int c = (int)Math.pow(num1,num2);
        return c;
    }

    static void show(int res){
        System.out.println(res);
    }
}

class MathOperationDemo{
    static public void main(String... args){
        int add = MathOperation.add(5,2);
        MathOperation.show(add); 
        int sub = MathOperation.subtract(5,2);
        MathOperation.show(sub);
        int mul = MathOperation.multiply(5,2);
        MathOperation.show(mul);
        int pow = MathOperation.power(5,2);
        MathOperation.show(pow);
    }
}
