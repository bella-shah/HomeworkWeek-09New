package P1Calculate;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        char op;
        String answer;
        // use do while condition
        do {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the first number : ");
            x = obj.nextInt();

            System.out.println("Enter the second number : ");
            y = obj.nextInt();

            System.out.println("Enter the operator : ");
            op = obj.next().charAt(0);

            Calculator calc = new Calculator();
            calc.calculateResult(x, y, op);

            System.out.println("“Would you like to do \n" + "more calculations? Please enter “Y” or “N” :");
            answer = obj.next();
        } while (answer.equals("Y"));

    }
}




