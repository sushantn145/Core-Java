class Employee1{
    int id;
    String name;
    Employee1(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "id = "+id+" name = "+name;
    }
    

}
class Demo{
    public static void main(String args[]){
        Employee1 e=new Employee1(101,"abd");
        System.out.println(e);
    }
}