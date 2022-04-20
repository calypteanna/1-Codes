package staticImport;



public class firstClass {
    public static void main(String[] args) {
        System.out.println("firstClass");
        System.out.println(secondClass.num1);
        System.out.println(secondClass.num2);

        secondClass num = new secondClass();
        num.num3 = 5;

        System.out.println(num.num3);



    }


}
