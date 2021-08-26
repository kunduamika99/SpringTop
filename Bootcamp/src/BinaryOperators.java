import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryOperators {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10,4,-1,5);
//        int[] arr = {6,-4,12,6,0,-10};
//        Integer converted[] = list.toArray(new Integer[5]);
//        for (int i = 0; i <converted.length ; i++) {
//            System.out.println(converted[i]);
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr,6));
        String[] arr1 = {"Camel" , "Peacock", "Llma"};
        String[] arr2 = {"Camel" , "Llma", "Peacock"};
        String[] arr4 = {"Camel" , null};
        String[] arr3 = {"Camel" };
        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.mismatch(arr1, arr2));
        System.out.println(Arrays.compare(arr3, arr4));
        System.out.println(Arrays.mismatch(arr3, arr4));
        System.out.println(Arrays.compare(arr4, arr4));
        System.out.println(Arrays.mismatch(arr4, arr4));

        String []str1 = {"abc", "def", "pqr", "xyz", "lmn"};
        String []str2 = {"abc", "def", "asr"};
        System.out.println(Arrays.compare(str1, str2));

//        String a, c, d;
//        Object b, a=b=new Object();
//        Object a=b, b=new Object();
//        String s  = new String("hello"), a = new Object();

    }
}
