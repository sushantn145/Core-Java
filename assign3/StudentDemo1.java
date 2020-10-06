/*31.	Create a class Student with 2 data members rno and name. 
Create one method setData() that takes roll number and student 
name as parameter and stores them in data members rno and name. 
Create one more method showData() to print the data member values.
Create another class ( main class) StudentDemo that creates Student 
class object and calls setData() and showData() methods.
32.	Modify the above program (no. 30) to count the no of Student 
objects created. [ In this program static variable is required ]
*/

class Student{
	private int rno;
	private String name;
	private static int objectcount;
	
	void setData(int rollno,String Studname){
		rno = rollno;
		name = Studname;
		objectcount+=1;
	}

	void show(){
		System.out.print("Roll NO : "+rno+"  ");
		System.out.print("Name : "+name+"  ");
		System.out.println("ObjectCount : "+objectcount);
	}
};

class StudentDemo1{
	public static void main(String args[]){
		Student S1 = new Student();
		S1.setData(145,"Sushant");
		S1.show();
		Student S2 = new Student();
		S2.setData(146,"Tushar");
		S2.show();
		S1.show();
		
	}	
}