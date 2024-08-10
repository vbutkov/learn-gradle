package ru.vbutkov;


import org.apache.commons.lang3.StringUtils;
import ru.productstart.utils.*;

public class App {
    public static void main(String[] args) {
        System.out.println(StringUtils.reverse("Hello world!"));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ArrayUtils.binarySearch(arr, 10));
    }
}
