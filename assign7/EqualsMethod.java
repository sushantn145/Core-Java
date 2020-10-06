/*50.	Explain the importance of toString() and equals() method of the 
Object class and override them on class Employee(empId,name,salary).  
a. Create class for main method(say XYZ),and accept five employees information and store in an array. 
Also ensure if entered empId already exist or not (use equals method). 
b. Display all employee info using toString method.
*/
import java.util.Scanner;
class Employee{
    private int empId;
    private String empName;
    private int salary;

    Employee(){
        this.empId=0;
        this.empName=null;
        this.salary=0;
    }

    Employee(int empId,String empName,int salary){
        //super();
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
        System.out.println("1");
        //System.out.println(empId+empName+salary);
    }
    //@Override
    public String toString(){
        System.out.println("2");
        System.out.println(empId+" "+empName+" "+salary);
        return empId+" "+empName+" "+salary;
    }

    int getempId(){
        return this.empId;
    }

    public boolean equals(Employee obj){// we can not directly compare Super class object with subclass
//Employee emp = (Employee)obj;
        return empId==obj.empId;
    }
}
class EqualsMethod{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
       //System.out.println("Enter Details EmpId,EmpName,Salary");
        
        // Employee e1 = new Employee(101,"Sushant",9000);
        // Employee e2 = new Employee(102,"Tushar",8000);
        // Employee e3 = new Employee(103,"Amol",7000);
        // Employee e4 = new Employee(104,"Manoj",6000);
        // Employee e5 = new Employee(105,"Parag",5000);
        // // int empId = sc.nextInt();
        // // String empName = sc.nextLine();
        // // //sc.nextLine();
        // // int salary = sc.nextInt()
        // System.out.println("=======================================");
        // System.out.println("ref"+e1.equals(e2));//it calls tostring method
        // System.out.println("ref"+e2);
        // System.out.println("ref"+e3);
        // System.out.println("ref"+e4);
        // System.out.println("ref"+e5);

        Employee arr[] =  new Employee[3];
        int empId;
        String empName;
        int salary;
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter The Details empId,empName,Salary");
            empId = sc.nextInt();
            sc.nextLine();
            empName = sc.nextLine();
            sc.nextLine();
            salary = sc.nextInt();

            Employee e1 = new Employee(empId,empName,salary);
            if(e1.equals(arr[i])){
                System.out.println("Employee id availabe");
            }else{
                arr[i] = e1;
            }
        }
        for(Employee e1 : arr){
            //System.out.println("empId : "+e.empId+" "+"empName : "+e.empName+" "+"salary : "+e.salary);
            System.out.println(e1);
        }
    }
}