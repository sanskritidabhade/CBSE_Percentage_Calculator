import java.util.Scanner;

public class Takingnput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);
    }
}
