package homework09new;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list
public class P6RetrieveElementFromArray {
    public static void main(String[] args) {
        // use ArrayList starting index value count from Zero
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("Suzuki Swift");

        System.out.println(cars.get(4));
    }
}




