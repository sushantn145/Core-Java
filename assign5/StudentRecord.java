// 40.	Create a class Student having data members name, roll no., age and score.
//  Write a program to accept 10 records of student and store them in an array. 
//  And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].

import java.util.Scanner;
class Student{
      String name;
      int rollNo;
      int age;
      int score;
    Student(String name,int rollNo,int age,int score){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }
	
     int getScores(){
	return this.score;
     }
    void show(){
        System.out.println("Name:"+name+" "+"RollNo:"+rollNo+" "+"Age:"+age+" "+"Score:"+score);
    }
}

class StudentRecord{
    static public void main(String []args){
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Student Name");
            String name = sc.nextLine();
            System.out.println("Enter Student RollNo");
            int rollNo = sc.nextInt();
            System.out.println("Enter Student Age");
            int age = sc.nextInt();
            System.out.println("Enter Student Score");
            int score = sc.nextInt();
            sc.nextLine();
            Student s = new Student(name,rollNo,age,score);
            arr[i] = s;
        }
	System.out.println("Enter Range Between [0-49] [50-64][64-79][80-100]");
		System.out.println("Enter Start num");
		int start = sc.nextInt();
		System.out.println("Enter End num");
		int end = sc.nextInt();
     		for(int i=0;i<arr.length;i++){
			if(arr[i].getScores()>=start && arr[i].getScores()<end){
			arr[i].show();
			}
		}

    }
}