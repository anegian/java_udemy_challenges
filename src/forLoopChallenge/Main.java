package forLoopChallenge;

public class Main {

    public static void main(String[] args) {

        boolean number = isPrimeNumber.isPrime(8);
        System.out.println(number);
        int primeNumberCount = 0;

        // for loop using the method to count prime numbers and stop when 3 prime numbers are found without break
        for (int i = 10; i < 40; i++) {

            if (isPrimeNumber.isPrime(i)) {
                if (primeNumberCount < 10) {
                    primeNumberCount++;
                    System.out.println("Number " + i + " is a prime number");
                }
            }
        }
        System.out.println("Exiting for loop\n");
    }
}