package untilString;

public class StringMethod {
    public static void main(String[] args) {
        System.out.println("=======charAt=======");//charAt

        String str = "Osman";
        System.out.println(str.charAt(1));//s


        System.out.println("=======length()=======");//length()

        System.out.println(str.length());

        System.out.println("=======toLowerCase=======");//toLowerCase

        str = str.toLowerCase();
        System.out.println(str);

        System.out.println("========toUpperCase======"); //toUpperCase

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("=======trim=======");//trim


        str = "   " + str + "    ";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);

        System.out.println("=======indexOf()=======");//indexOf()

        int a = str.indexOf("O");
        System.out.println(a);

        System.out.println("=======lastIndexOf======="); //lastIndexOf

        int b = str.lastIndexOf(a);
        System.out.println(b);

        str = "x" + str + "x";
        int c = str.lastIndexOf(str);
        System.out.println(c);

        System.out.println("======replace========");//replace

        System.out.println(str);
        str = str.replace("x","");
        System.out.println(str);


        System.out.println("=======replaceFirst=======");//replaceFirst

        str = "x"+str+"x";
        System.out.println(str);
        str = str.replaceFirst("x","");
        System.out.println(str);

        System.out.println("=======substring(x)=======");//substring(x)

        str = str.substring(2);
        System.out.println(str);

        System.out.println("======replaceFirst(x,x)========");//replaceFirst(x,x)

        str = str.substring(1,3);
        System.out.println(str);

        System.out.println("=======repeat=======");//repeat

        System.out.println(str);
        str = str.repeat(3);
        System.out.println(str);

        System.out.println("=======isEmpty=======");//isEmpty

        str = "    ";
        System.out.println(str);

        boolean b1 = str.isEmpty();
        System.out.println(b1);

        System.out.println("======isBlank()========");//isBlank()

        System.out.println(str);
        boolean b2 = str.isBlank();
        System.out.println(b2);

        System.out.println("======equal========");//equal
        System.out.println("-----String str1 = \"Ahmet\";----");
        String str1 = "Ahmet";
        String str2 = "Ahmet";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str1.equals(str2) ==> " + (str1.equals(str2)));
        System.out.println("str1 = str2 ==> " + (str1 == str2));

        System.out.println("-----String str3 = new String(\"Ahmet\");----");

        String str3 = new String("Ahmet");
        String str4 = new String("Ahmet");

        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        System.out.println("str3.equals(str4) ==> " + (str3.equals(str4)));
        System.out.println("str3 = str4 ==> " + (str3 == str4));


        System.out.println("======equal========");//equalIgnoreCase

        String str11 = "Mehmet";
        String str12 = "mehmet";

        System.out.println("str11 = " + str11);
        System.out.println("str12 = " + str12);

        System.out.println("str11.equals(str12) ==> " + (str11.equals(str12)));
        System.out.println("str11.equalsIgnoreCase(str12) ==> " + (str11.equalsIgnoreCase(str12)));


        System.out.println("======contains========");//contains

        String str21 = "I am in Ankara. Ankara is capital of Turkey";
        String str22 = "Ankara";
        String str23 = "Corum";

        System.out.println("str21 = " + str21);
        System.out.println("str22 = " + str22);
        System.out.println("str23 = " + str23);
        System.out.println("str21.contains(str22) ==> "+str21.contains(str22));
        System.out.println("str21.contains(str23) ==> "+str21.contains(str23));

        System.out.println("======startWith========");//startWith

        String str31 = "Osman";
        String str32 = "O";

        System.out.println("str31 = " + str31);
        System.out.println("str32 = " + str32);
        System.out.println("str31.startsWith(str32) ==> "+str31.startsWith(str32));
        System.out.println("str31.startsWith(str32,5) ==> "+str31.startsWith(str32,5));

        System.out.println("======endsWith========");//endsWith

        String str41 = "Osman";
        String str42 = "n";

        System.out.println("str41 = " + str41);
        System.out.println("str42 = " + str42);
        System.out.println("str41.endsWith(str42) ==> " + str41.endsWith(str42));


    }
}
