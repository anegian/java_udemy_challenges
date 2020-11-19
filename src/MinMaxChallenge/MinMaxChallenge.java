package MinMaxChallenge;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        countMinMax();
    }

    public static void countMinMax() {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean initialNumber= true;

        while (true) {

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                /** one way to handle min number bug is to use a boolean flag like boolean initialNumber */
                if(initialNumber){
                    initialNumber=false;
                    min=number;
                    max=number;
                }

                if (number>max) {
                    max = number;
                }
                if (number<min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The max number was: "+ max);
        System.out.println("The min number was: "+ min);
        scanner.close();
    }
}
