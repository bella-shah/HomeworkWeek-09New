package homework09new;

import java.util.Arrays;

//Write a Java program to reverse an array of integer values.
public class P3ReverseArray {
    public static void main(String[] args) {
        // use Array single dimensional
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Original array : " + Arrays.toString(a));
        // for loop condition
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(a));
    }
}



