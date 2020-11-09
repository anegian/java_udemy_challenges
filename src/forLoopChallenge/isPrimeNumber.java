package forLoopChallenge;

public class isPrimeNumber {

    public static boolean isPrime (int n){
        if (n==1){
            return false;
        }
        /** for loop optimizing.
         *  instead of i <= n/2
         *  we prefer (long) Math.sqrt(n)
         *  by that the for loop makes less loops*/
            for (int i=2; i<= n/2; i++){
                if (n % i == 0){
                    return false;
                }
            }
        return true;
    }
}
