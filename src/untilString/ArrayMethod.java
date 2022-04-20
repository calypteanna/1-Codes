package untilString;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {


        System.out.println("======toString========");//toString

        int[] arr = {1,2,3,4,5,6};
        System.out.println("arr ==> " + arr);
        System.out.println("Arrays.toString(arr) ==> " + Arrays.toString(arr));


        System.out.println("======sort========");//sort

        int[] arr2 = {6,1,3,2,5,4};
        System.out.println("Arrays.toString(arr2) ==> " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Arrays.toString(arr2) ==> " + Arrays.toString(arr2));

        System.out.println("======equals========");//equals

        System.out.println("Arrays.toString(arr) ==>  " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arr2) ==> " + Arrays.toString(arr2));
        System.out.println("Arrays.equals(arr,arr2) ==> " + Arrays.equals(arr,arr2));



        System.out.println("======copyOf========");//copyOf

        System.out.println("Arrays.toString(arr) ==>  " + Arrays.toString(arr));
        int[] copyOFarr = Arrays.copyOf(arr,8);
        System.out.println("Arrays.toString(copyOFarr) ==>  " + Arrays.toString(copyOFarr));

        int[] copy2OFarr = Arrays.copyOf(arr,3);
        System.out.println("Arrays.toString(copy2OFarr) ==>  " + Arrays.toString(copy2OFarr));


        System.out.println("======copyOfRange========");//copyOfRange

        System.out.println("Arrays.toString(arr) ==>  " + Arrays.toString(arr));
        int[] copy3OFarr = Arrays.copyOfRange(arr,1,5);
        System.out.println("Arrays.toString(copy3OFarr) ==>  " + Arrays.toString(copy3OFarr));

        System.out.println("======deepToString========");//deepToString

        int[][] myArr2D = {{1,2,3},{4,5},{6}};

        System.out.println("myArr2D ==> " + myArr2D);
        System.out.println("Arrays.deepToString(myArr2D[1]) ==> " + Arrays.deepToString(myArr2D));

        System.out.println("myArr2D[1] ==> " + myArr2D[1]);
        System.out.println("Arrays.toString(myArr2D[1]) ==> " + Arrays.toString(myArr2D[1]));

        System.out.println("myArr2D[1][2] ==> " + myArr2D[0][2]);







    }
}
