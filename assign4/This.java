//33.	Write a program to demonstrate functionalities of this keyword in java. 

class Student{
    private int rollNo;
    private String studentName;
    private static int totalCount;

    void set(int rollNo,String studentName,int totalCount){
        // rollNo = rollNo;
        // studentName = studentName;
        // totalCount = totalCount;
        System.out.println(this);
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.totalCount = totalCount;
    }
    void show(){
        System.out.println(rollNo+" "+studentName+" "+totalCount);
    }
}

class StudentDemo{
    static public void main(String... args){
        Student s =new Student();
        System.out.println(s);
        s.set(010,"Sushant",1);//if we take 0 at start t will convert no into octal
        s.show();
        s.set(101,"Tushar",2);
        s.show();
    }
}