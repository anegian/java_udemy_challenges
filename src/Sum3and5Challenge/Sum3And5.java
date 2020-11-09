package Sum3and5Challenge;

public class Sum3And5 {

    public static void main(String[] args) {

        int count=0;
        int sum=0;
        for (int i=1; i<=1000; i++){
            if (getSum(i)) {
                count++;
                sum +=i;
                System.out.println("Number " + i + " meets the conditions.");

                if (count==5)
                    break;
            }
        }
        System.out.println("We have met the conditions and the new sum is: " + sum);
    }
    public static boolean getSum (int number){

        return (number % 3 == 0) && (number % 5 == 0);
    }
}
