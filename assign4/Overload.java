/*36.	Create a class MathOperation containing overloaded methods ‘multiply’ to 
calculate multiplication of following arguments. 
two integers 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/

import java.util.Scanner;
class MathOperation{
    static void multiply(int num1,int num2){
        int res = num1*num2;
        System.out.println(res);
    }
    static void multiply(float num1,float num2,float num3){
        float res =  num1*num2*num3;
        System.out.println(res);
    }
    static void multiply(int arr[]){
        int res=1;
        for(int a : arr){
            res = res*a; 
        }
        System.out.println(res);
    }
    static void multiply(int num1,double num2){
        double res = num1*num2;
        System.out.println(res);
    }
}
class Overload{
    static public void main(String... args){
        MathOperation.multiply(5,2);
        MathOperation.multiply(5.2F,2.3F,5.5F);
        MathOperation.multiply(5,5.5);
        int arr[] = {1,2,3,4,5};
        MathOperation.multiply(arr);
    }
}



