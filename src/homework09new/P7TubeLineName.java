package homework09new;

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with underground tube names
public class P7TubeLineName {

    public static void main(String[] args) {

        //Defined ArrayList with tube name
        ArrayList<String> station = new ArrayList<>();
        station.add("District Line");
        station.add("Metropolitan");
        station.add("Jubilee");
        station.add("Picccadilly ");
        station.add("Bakerloo Line");
        station.add("Victoria Line");

        // Use Arraylist with Empty or not
        System.out.println(station.get(4));
        System.out.println(station.isEmpty());
    }
}


