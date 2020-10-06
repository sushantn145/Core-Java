/*01.	Create three classes
-	Faculty with two data members facultyId and salary and two methods,
    one intput() method for accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ 
    basicSalary and allowance. Override input() method in this class that calls super class inut() 
    method and accepts basicSalary and allowance as input. Salary should not be accepted as input but 
    should be calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ 
    workingHours, ratePerHour. Override input() method in this class that calls super class inut() 
    method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input 
    but should be calculated using formula ( workingHour * ratePerHour )
*/
import java.util.Scanner;
class Faculty{
    private int facultyId;
    private int salary;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter FacultyID:");
        facultyId=sc.nextInt();
    }
    void setSalary(int salary){
        this.salary=salary;
    }
    void printSalary(){
        System.out.println("Salary : "+salary);
    }
}
class FullTimeFaculty extends Faculty{
    private int basicSalary;
    private int allowance;

    void input(){
        super.input();
        System.out.println("Enter basicSalary:");
        basicSalary = sc.nextInt();
        System.out.println("Enter allowance:");
        allowance=sc.nextInt();
        setSalary(basicSalary+allowance);
    }
}
class PartTimeFaculty extends Faculty{
    private int workingHour;
    private int ratePerHour;

    void input(){
        super.input();
        System.out.println("Enter workingHour:");
        workingHour=sc.nextInt();
        System.out.println("Enter ratePerHour:");
        ratePerHour=sc.nextInt();
        setSalary(workingHour*ratePerHour);
    }
}

class FacultyDemo{
    public static void main(String args[]){
        System.out.println("For Full time Faculty:");
        FullTimeFaculty f = new FullTimeFaculty();
        f.input();
        f.printSalary();
        System.out.println("====================");
        System.out.println("For Parttime Faculty:");
        PartTimeFaculty p =new PartTimeFaculty();
        p.input();
        p.printSalary();
    }
}
