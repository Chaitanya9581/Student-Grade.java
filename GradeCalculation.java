import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;
        int total;
        double percentage;

        System.out.println("Enter marks of 5 subjects:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage >= 90)
            System.out.println("Grade: A+");
        else if (percentage >= 80)
            System.out.println("Grade: A");
        else if (percentage >= 70)
            System.out.println("Grade: B+");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 50)
            System.out.println("Grade: C");
        else if (percentage >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");

        sc.close();
    }
}
