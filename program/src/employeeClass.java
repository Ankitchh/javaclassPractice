
class employees {
    int salary;
    String name;
    public employees (int salary,String name){
        this.name = name;
        this.salary = salary;

    }
    public int get_salary (){
        return salary;
    }
    public String get_name (){
       return name;
    }
    public void set_name (String name){
       this.name = name;
    }
}


public class employeeClass {
    public static void main(String[] args) {
        employees dat = new employees(50000,"Ankit");
        System.out.println("Employee Name "+dat.get_name());
        System.out.println("Employee Salary "+dat.get_salary());
        dat.set_name("Umesh");
        System.out.println("Updated name "+dat.get_name());

    }



}
