package ReadingUserInputChallenge;

import java.util.Scanner;

public class ReadingInputChallenge {

    public static void main(String[] args) {

        calculateSumOfValidInputs();

    }

    public static void calculateSumOfValidInputs() {
        Scanner scanner = new Scanner(System.in);
        int sumCount = 0;
        int counter = 1;

        for (int i = 0; i < 11; i++) {
            int order = counter++;
            System.out.println("Enter number # " + order + ": ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();


                System.out.println("Voted: " + number);
                sumCount += number;

            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();    // handle Enter key and prevent not taking another input
        }
        System.out.println(sumCount);

        scanner.close();
    }
}
