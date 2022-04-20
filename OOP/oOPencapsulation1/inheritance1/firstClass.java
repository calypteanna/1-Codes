package oOPencapsulation1.inheritance1;

class A{
    public A(int x) {
        System.out.println("A" + x);
    }
}

class B extends A{
    public B() {
        super(5);
        System.out.println("B");
        System.out.println("B");
    }
}

public class firstClass {
    public static void main(String[] args) {

        B objectB = new B();

    }
}
