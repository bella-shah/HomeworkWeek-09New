package homework09new;

import java.util.Scanner;
// write the student mark sheet programme using if else and while loop.

public class P2StudentMarkSheet {
    public static void main(String[] args) {//main method
        int Rollnumber, Maths, Science, English, Total;
        int marks;
        double avg;
        String name, result = null, grade = null;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        name = s.next();
        System.out.println("Enter Student roll number:");
        Rollnumber = s.nextInt();
        System.out.println("Maths marks: ");
        Maths = s.nextInt();
        while (Maths < 0 && Maths > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");
        }

        System.out.println("Science marks: ");
        Science = s.nextInt();
        // use while loop condition
        while (Science < 0 && Science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");
        }

        System.out.println("English marks: ");
        English = s.nextInt();
        while (English < 0 && English > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");
        }

        double total = Maths + Science + English;
        avg = total / 3;

        // use if - else condition

        if (avg >= 35) {
            result = "Pass";
        } else if (avg >= 80) {
            grade = "Garde A+";
        } else if (avg >= 60) {
            grade = "Grade A";
        } else if (avg >= 50) {
            grade = "Grade B";
        } else if (avg >= 35) {
            grade = "Grade C";
        } else {
            result = "Fail";
        }
        System.out.println("|-----------------------------------------|");
        System.out.println("|         Mark Sheet                      |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|    Name      :       " + name + "|");
        System.out.println("|    Roll No.  :       " + Rollnumber + "|");
        System.out.println("|-----------------------------------------|");
        System.out.println("|    Subject   :        Marks             |");
        System.out.println("|    Maths     :        " + Maths + "|");
        System.out.println("|    Science   :        " + Science + "|");
        System.out.println("|    English   :        " + English + "|");
        System.out.println("|-----------------------------------------|");
        System.out.println("|    Total     :        " + total + "|");
        System.out.println("|-----------------------------------------|");
        System.out.println("|    Percentage:        " + avg + "|");
        System.out.println("|    Result    :        " + result + "|");
        System.out.println("|    Grade     :        " + grade + "|");
        System.out.println("|-----------------------------------------|");

    }
}



