package oOPencapsulation1.task1;

public class EmployeeClass {

    private String name;
    private char gender;
    private int age;
    private double salary;

    //constructor method
    public EmployeeClass(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    //getter and setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.isEmpty()){
            System.err.println("Invalid data");
            System.exit(1);
        }

        this.name = name;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        if(!(gender == 'f' || gender == 'm')){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.gender = gender;
    }

    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 16 || age > 90){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.age = age;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary <= 0){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.salary = salary;
    }






}
