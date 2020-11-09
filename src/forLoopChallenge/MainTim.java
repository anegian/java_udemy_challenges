package forLoopChallenge;

public class MainTim {
    public static void main(String[] args) {

        int count=0;

        // for loop using the method to count prime numbers and stop when 3 prime numbers are found with break
        for (int i = 10; i < 50; i++){
            if (isPrimeNumber.isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count==10){
                    System.out.println("Exiting for loop\n");
                break;
                }
            }
        }
    }
}
