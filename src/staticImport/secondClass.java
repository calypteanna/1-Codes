package staticImport;

public class secondClass {

    public static int num1;
    public static int num2;
    public int num3;

    static {
        num1 = 1;
    }

      public static void sum1(){
        System.out.println("from sum1 with num1 " + num1 );
    }

    public void sum2(){
        System.out.println("from sum2 with num3 " + num3);
    }





}
