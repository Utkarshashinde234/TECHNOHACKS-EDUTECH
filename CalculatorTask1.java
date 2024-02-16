
import java.util.*;

public class CalculatorTask1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic calculator");

        while (true) {

            System.out.println("Choose an Operation:");
            System.out.println("1.Addition ");
            System.out.println("2.Subtrsction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division ");
            System.out.println("5.Exit");

            int choice = sc.nextInt();

            if (choice == 5) {

                System.out.println("Exit the calculator");
                break;
            }

            System.out.println("Enter First number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result:" + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result:" + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result:" + result);
                    break;

                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result:" + result);

                    } else {
                        System.out.println("cannot divide by zero");

                    }
                    break;

                default:
                    System.out.println("Invalid choice ");

                    switch (choice) {

                    }

                    sc.close();

            }
        }
    }
}
