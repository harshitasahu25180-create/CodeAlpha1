
import java.util.ArrayList;
import java.util.Scanner;

public class codealpha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayLists to store student data
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> marks = new ArrayList<>();

        // Ask number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter marks: ");
            double mark = sc.nextDouble();

            names.add(name);
            marks.add(mark);
        }

        // Calculate total
        double total = 0;

        double highest = marks.get(0);
        double lowest = marks.get(0);

        String highestStudent = names.get(0);
        String lowestStudent = names.get(0);

        for (int i = 0; i < n; i++) {

            total = total + marks.get(i);

            // Find highest marks
            if (marks.get(i) > highest) {
                highest = marks.get(i);
                highestStudent = names.get(i);
            }

            // Find lowest marks
            if (marks.get(i) < lowest) {
                lowest = marks.get(i);
                lowestStudent = names.get(i);
            }
        }

        // Calculate average
        double average = total / n;

        // Display report
        System.out.println("\n=================================");
        System.out.println("       STUDENT GRADE REPORT");
        System.out.println("=================================");

        for (int i = 0; i < n; i++) {
            System.out.println(
                names.get(i) + " : " + marks.get(i)
            );
        }

        System.out.println("---------------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest +
                           " (" + highestStudent + ")");
        System.out.println("Lowest Marks  : " + lowest +
                           " (" + lowestStudent + ")");

        System.out.println("=================================");

        sc.close();
    }
}