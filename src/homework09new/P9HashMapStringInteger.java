package homework09new;

import java.util.Map;
//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

public class P9HashMapStringInteger {
    public static void main(String[] args) {
        // declare Map
        Map<String, Integer> people = new java.util.HashMap<>();
        people.put("John", 25);
        people.put("Bob", 19);
        people.put("Sam", 27);
        people.put("Billy", 24);
        //foreach with key string,integer key word
        for (Map.Entry<String, Integer> p : people.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }

    }

}
