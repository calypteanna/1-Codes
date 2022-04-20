package customClass2;

public class CreatingObjects {

    public static void main(String[] args) {
        new CreatingObjects();
        System.out.println("main Method");

    }

    static {
        System.out.println("static block");
    }

    public CreatingObjects(){
        System.out.println("createdClass");
    }


}
