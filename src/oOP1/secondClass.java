package oOP1;

public class secondClass {

    private String name ;
    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("It is invalid data");
            System.exit(1);
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
