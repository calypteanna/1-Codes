package untilString;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println(list);

        //removeIf
        boolean r1 = list.removeIf(p -> p < 5);
        System.out.println("r1 = " + r1);
        System.out.println(list);


    }
}
