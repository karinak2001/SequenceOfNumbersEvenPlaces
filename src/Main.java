import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // כתוב תרשים זרימה שקולט סידרת מספרים שמסתיימת במספר -1 והדפס על המסך את
        //כל המספרים במקומות הזוגיים.

        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int count = 0;

        // Prompt for input
        System.out.println("Enter a series of numbers ending with -1:");

        // Loop until input is -1
        while (true) {
            int number = scanner.nextInt();

            // Check if input is -1, if yes, exit loop
            if (number == -1)
                break;


            // Increment count
            count++;

            // Check if count is even, if yes, print the number
            if (count % 2 == 0) {
                System.out.print(number + ", ");
            }
        }

    }
}