package lesson2.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void sort(Integer[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int value = arr[i];

            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = value;
//            System.out.println(Arrays.toString(arr));


        }
    }
}
