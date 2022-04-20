package oOPencapsulation1.days36_warmUp;

public class Student {

    private String name,schoolName;
    private int age;
    private char gender,grade;


    //Setters
    public void setName(String name) {
        this.name = this.name;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = this.schoolName;
    }

    public void setAge(int age) {
        if(age<5 || age >90){
            System.err.println("Invalid Value");
            System.exit(0);
        }
        this.age = age;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.err.println("Invalid Value");
            System.exit(0);
        }
        this.grade = grade;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid Value");
            System.exit(0);
        }
        this.gender = gender;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public char getGender() {
        return gender;
    }


    public Student(String name, String schoolName, int age, char gender, char grade) {
        setName(name);
        setSchoolName(schoolName);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
