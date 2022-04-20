package customClass;

public class creatingObjects {
    public static void main(String[] args) {

        creatingClass man1 = new creatingClass();

        man1.name = "Osman";
        man1.age = 32;
        man1.gender = 'M';

        System.out.println(man1);

        man1.writeName();
        man1.writeNameAge();
        man1.threeInf();


    }
}
