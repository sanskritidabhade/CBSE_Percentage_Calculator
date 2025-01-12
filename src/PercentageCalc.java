import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args) {
        System.out.println("----CBSE Percentage Calculator----");
        Scanner sc = new Scanner(System.in);

        //Subject 1
        System.out.print("Enter Maximum Marks for Subject 1: ");
        int max1 = sc.nextInt();
        System.out.print("\nHow much did you score?: ");
        float sub1 = sc.nextFloat();

        //Subject 2
        System.out.print("\nEnter Maximum Marks for Subject 2: ");
        int max2 = sc.nextInt();
        System.out.print("\nHow much did you score?: ");
        float sub2 = sc.nextFloat();

        //Subject 3
        System.out.print("\nEnter Maximum Marks for Subject 3: ");
        int max3 = sc.nextInt();
        System.out.print("\nHow much did you score?: ");
        float sub3 = sc.nextFloat();

        //Subject 4
        System.out.print("\nEnter Maximum Marks for Subject 4: ");
        int max4 = sc.nextInt();
        System.out.print("\nHow much did you score?: ");
        float sub4 = sc.nextFloat();

        //Subject 5
        System.out.print("\nEnter Maximum Marks for Subject 5: ");
        int max5 = sc.nextInt();
        System.out.print("\nHow much did you score?: ");
        float sub5 = sc.nextFloat();

        // Calculation
        int total_marks = max1 + max2 + max3 + max4 + max5;
        float obtained_marks = sub1 + sub2 + sub3 + sub4 + sub5;

        float percentage = (obtained_marks/total_marks) * 100;
        System.out.printf("Your overall percentage is: %f", percentage);
    }
}
