/*45.	Create a class Student with two members : rollno and percentage. 
Create default and parameterized constructors. Create method show() 
to display information. Create another class CollegeStudent inherits Student class. 
Add a new member semester to it. Create default and parameterized constructors. 
Also override show() method that calls super class show() method and displays semester. 
Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) 
to it. Create default and parameterized constructors. Also override show() method that calls 
super class show() method and displays className. Create a class( say Demo) with main method 
that carries out the operation of the project : -- has array to store objects of any class(Student,  
CollegeStudent or SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and 
store them inside the array -- display all records from the array -- search record on the basic of 
rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many students 
are having A grade, if for A grade percentage >75.
*/ 
import java.util.Scanner;
class Student{
    int rollNo;
    double percentage;

    Student(){
        this.rollNo=0;
        this.percentage=0;
    }
    Student(int rollNo,double percentage){
        this.rollNo=rollNo;
        this.percentage=percentage;
    }
    void show(){
        System.out.println("rollNo : "+rollNo+"  "+"percentage : "+percentage);
    }
}
class CollegeStudent extends Student{
    public int semester;
    CollegeStudent(){
        this.semester=0;
    }
    CollegeStudent(int rollNo,double percentage, int semester){
        super(rollNo,percentage);
        this.semester=semester;
    }
    void show(){
        super.show();
        System.out.println("semester : "+semester);
    }
}

// Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) 
// to it. Create default and parameterized constructors. Also override show() method that calls 
// super class show() method and displays className.
class SchoolStudent extends Student{
    String className;
    SchoolStudent(){
        this.className=null;
    }
    SchoolStudent(int rollNo,double percentage,String className){
        super(rollNo,percentage);
        this.className=className;
    }
    void show(){
        super.show();
        System.out.println("className : "+className);
    }
}

// Create a class( say Demo) with main method 
// that carries out the operation of the project : -- has array to store objects of any class(Student,  
// CollegeStudent or SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and 
// store them inside the array -- display all records from the array -- search record on the basic of 
// rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many students 
// are having A grade, if for A grade percentage >75.

class StudentDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student arr[] = {new CollegeStudent(), new SchoolStudent()};
        int rollNo;
        double percentage;
        int semester;
        String className;
        // for(int i=0;i<arr.length;i++){
        //     arr[i].rollNo=sc.nextInt();
        //     arr[i].percentage=sc.nextDouble();
        //     //arr[i].semester=sc.nextInt();
        // }
        for(int i=0;i<arr.length;i++){
            if(arr[i] instanceof CollegeStudent){
                rollNo=sc.nextInt();
                percentage=sc.nextDouble();
                semester=sc.nextInt();
                CollegeStudent c = new CollegeStudent(rollNo,percentage,semester);
                arr[i] = c;
            }else{
                rollNo=sc.nextInt();
                percentage=sc.nextDouble();
                sc.nextLine();
                className=sc.nextLine();
                SchoolStudent st = new SchoolStudent(rollNo,percentage,className);
                arr[i] = st;
            }
            
            
        }
        for(Student ar :arr){
            if(ar instanceof CollegeStudent){
                ar.show();
            }else{
                ar.show();
            }
        }
    }
}