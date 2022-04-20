package oOPencapsulation1;

public class classFolder {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;

    public classFolder(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings=0;
        numberOfHead=1;
    }

    public static void printPlanetName(){
        System.out.println("Planet is " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }


    public String toString() {
        return "classFolder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}
