package garbageCollection;

import java.util.ArrayList;

public class firstClass {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        System.out.println("1. list1 => " + list1);
        System.out.println("----------");

        ArrayList<Integer> list2 = list1;

        System.out.println("2. list1 => " + list1);
        System.out.println("2. list2 => " + list1);
        System.out.println("----------");

        list2.add(200);
        System.out.println("3. list1 => " + list1);
        System.out.println("3. list2 => " + list1);
        System.out.println("----------");

        list1.add(300);
        System.out.println("4. list1 => " + list1);
        System.out.println("4. list2 => " + list1);
        System.out.println("----------");


    }
}
