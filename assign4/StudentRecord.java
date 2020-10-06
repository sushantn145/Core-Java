// 40.	Create a class Student having data members name, roll no., age and score.
//  Write a program to accept 10 records of student and store them in an array. 
//  And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].

import java.util.Scanner;
class Student{
    private String name;
    private int rollNo;
    private int age;
    private int score;

    Student(){

    }
    Student(String name,int rollNo,int age,int score){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    void show(){
        System.out.println("Name:"+name+" "+"RollNo:"+rollNo+" "+"Age:"+age+" "+"Score:"+score);
    }


}

class StudentRecord{
    static public void main(String []args){
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Student Name");
            String name = sc.nextLine();
            System.out.println("Enter Student RollNo");
            int rollNo = sc.nextInt();
            System.out.println("Enter Student Age");
            int age = sc.nextInt();
            System.out.println("Enter Student Score");
            int score = sc.nextInt();
            
            Student s = new Student(name,rollNo,age,score);
            arr[i] = s;
        }

        for(Student ar : arr){
            ar.show();
        }
    }
}