package homework09new;

import java.util.Set;
//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.Show which numbers are between 1 and 10 are in
public class P8HashSetIntergerObj{
    public static void main(String[] args) {
        // Use Hash Set method
        Set<Integer> num = new java.util.HashSet<>();
        num.add(4);
        num.add(7);
        num.add(8);
        // use for loop and if-else condition
        for (int i = 1; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}









