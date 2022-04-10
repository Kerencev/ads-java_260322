package lesson2.search;

import java.util.Objects;

public class ExponentialSearch {

    public static int search(Integer[] arr, Integer num2Find) {
        if (Objects.equals(arr[0], num2Find)) {
            return 0;
        }

        int base = 1;
        int i = 0;

        while (base < arr.length && arr[base] <= num2Find) {
            i++;

            if (Objects.equals(arr[base], num2Find)) {
                System.out.println("ЧИСЛО НАЙДЕНО. ЭП. Кол-во итераций: " + i);
                return base;
            }
            base *= 2;
        }

        System.out.printf("ЭП ЗАКОНЧЕН. Итераций: %s, от %s, до %s%n", i, base / 2 + 1, Math.min(base - 1, arr.length - 1));

        return BinarySearch.search(arr, num2Find, base / 2 + 1, Math.min(base - 1, arr.length - 1));
    }
}
