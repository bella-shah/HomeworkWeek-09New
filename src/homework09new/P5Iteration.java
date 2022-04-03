package homework09new;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using Iterator.
public class P5Iteration {
    public static void main(String[] args) {
        //Array List
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // use Iterator with while condition
        Iterator num = list.iterator();
        while (num.hasNext()) {
            System.out.println(num.next());
        }
    }
}




