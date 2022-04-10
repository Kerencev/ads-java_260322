package lesson2;

import lesson2.search.BinarySearch;
import lesson2.search.ExponentialSearch;
import lesson2.search.InterpolationSearch;
import lesson2.sort.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = true;
        final int SIZE = 50000;
        Integer[] arr = MyArray.getArray(SIZE, 1);

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);

//        System.out.println(Arrays.toString(arr));

        SpeedTest.startTime();

        //ТЕСТ СОРТИРОВОК
//        BubbleSort.sort(arr); //(для 50000) 10858 - 3
//        SelectionSort.sort(arr); //2827 - 998
//        CocktailSort.sort(arr); //12775
//        CombSort.sort(arr); //67 - 8
//        InsertionSort.sort(arr); //2312 - 5
//        Arrays.sort(arr); //31
        CountingSort.sort(arr); //7


        SpeedTest.endTime();

//        System.out.println(Arrays.toString(arr));

        //ТЕСТ ПОИСКА
        System.out.println(arr[arr.length - 1]);
        final int NUM2FIND = 10;
        System.out.println(BinarySearch.search(arr, NUM2FIND));
        System.out.println(ExponentialSearch.search(arr, NUM2FIND));
        System.out.println(InterpolationSearch.search(arr, NUM2FIND));



    }
}
