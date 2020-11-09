package DigitSum;

public class digitSum {

    public static void main(String[] args) {

       int sum = sumDigit(125);
        System.out.println(sum);

        // another way to call the method
        System.out.println("\nThe sum of the digits in number 125 is : " + sumDigit(125) );
        System.out.println("\nThe sum of the digits in number 1234 is : " + sumDigit(1234) );
        System.out.println("\nThe sum of the digits in number -150 is : " + sumDigit(-150) );
        System.out.println("\nThe sum of the digits in number 2546 is : " + sumDigit(2546) );
    }
    public static int sumDigit (int number){
        if (number<10) {
            return -1;
        }

        /** i.e we have number 125 ->                     1.(line 28) 125%10 = (int)5 (last digit)
        *      2. (line 32) 125/10= (12.5 but int) 12 --> 3.(line 28) 12%10 = (int)2 (middle digit)
        *      4. (line 32) 12/10= (1.2 but int) 1 -->    5.(line 28) 1%10 = (int)1 (initial digit)
        *      6. (line 32) 0/10= 0 the loop ends -->     7.(line 34) */
        int sum =0;
        while (number>0){  // loop goes on until number gets to 0. this happens when 1 / 10 = (int) 0
            //extract the least-significant number (τελευταίο ψηφίο)
            int digit = number % 10;
            sum+=digit;

            //cuts the least significant digit
            number /= 10;   //same as number = number /10
        }
        return sum;
    }
}
