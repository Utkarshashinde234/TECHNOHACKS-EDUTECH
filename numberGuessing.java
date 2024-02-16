import java.util.*;

public class numberGuessing {
    public static void game() {
        System.out.println("====================================");
        System.out.println("Welcome to Number Guessing Game:");
        System.out.println("Choose Number between 1 to 100");
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);

        int number = (int) (Math.random() * 100) + 1;

        int trials = 5;
        int i;

        for (i = 1; i < 6; i++) {
            System.out.println("Enter your number:");
            int choose = sc.nextInt();
            if (choose == number) {
                System.out.println("Congratulations...your number is matched withnumber");

            } else if (choose < number) {

                System.out.println("Your number is less than Magic Number");
            } else if (choose > number) {
                System.out.println("Your number is more than maggic number :");
            }
        }

        if (i > trials) {
            System.out.println("Sorry ...your trials are Exhausted");
            System.out.println("=====================================");
            System.out.println("Magic Number is :" + number);
            System.out.println("================================================");

        }

    }

    public static void main(String args[]) {

        game();
    }

}
