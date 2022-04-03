package homework09new;

import java.util.ArrayList;
//Write a Java program to create a new array list, add some colours (string) and print out the collection using for each loop.

public class P4ColourArray {

    public static void main(String[] args) {
        //Array List
        ArrayList<String> list = new ArrayList<>();
        list.add("Green");
        list.add("Blue");
        list.add("Red");
        list.add("Yellow");
        list.add("Purple");
        //use foreach loop condition
        for (String colors : list) {
            System.out.println(colors);
            {


            }


        }
    }
}


