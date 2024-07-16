class  employee {
    int id;
    String name;
    int salary;
    public void Dets (){
        System.out.println("Name is "+name);
        System.out.println("Id is "+ id);
    }
}


public class coustom_class {
    public static void main(String[] args) {
        employee daddy = new employee();
        employee umesh = new employee();
        daddy.id = 101;
        daddy.name = "Ballu";
        daddy.salary = 150 ;
        daddy.Dets();
        System.out.println("Salary is "+daddy.salary + " Rupya");

        umesh.id = 102;
        umesh.name = "Umu";
        umesh.salary = 151 ;
        umesh.Dets();
        System.out.println("Salary is "+umesh.salary + " Rupya");
    }
}
