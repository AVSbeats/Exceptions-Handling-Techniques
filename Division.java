import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        System.out.println();

        int numerator, denominator, results;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Numerator: ");
        numerator = input.nextInt();

        System.out.print("Enter Denominator: ");
        denominator = input.nextInt();

        // Without the 'if' the input can be zero making an exception for
        // java.lang.ArithmeticException: / by zero
        if (denominator == 0) {
            System.out.println("Can't divide by 0 because an 'Exception/Error' will appear!!!");
        } else {

            results = (numerator / denominator);

            System.out.println(numerator + "/" + denominator + " = " + results);
        }

        System.out.println();
    }
}