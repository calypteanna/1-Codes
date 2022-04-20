package customClass;

public class creatingClass {

    public String name;
    public int age;
    public char gender;

    public void writeName() {
        System.out.println("It is " + name);
    }

    public void writeNameAge() {
        System.out.println(name + " is " + age + " years old");
    }

    public void threeInf() {
        System.out.println(name + " is a/an " + gender + " and " + age + " years old.");
    }

    public String toString() {
        return "creatingClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
