package oOPencapsulation1.task1;

public class EmployeeObject {

    public static void main(String[] args) {
        EmployeeClass employee1 = new EmployeeClass("Osman",'m',32,40000);

        System.out.println(employee1);

        employee1.setSalary(employee1.getSalary()+10000);

        System.out.println(employee1);


    }

}
