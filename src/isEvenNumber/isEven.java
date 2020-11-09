package isEvenNumber;

public class isEven {

    public static void main(String[] args) {
        /** isEvenNumber method test */
        boolean isEven = isEvenNumber(100);
        System.out.println(isEven);

        //while loop and use of if with continue and if statement to find the total even numbers counted
        int number =4;
        int finalnumber=20;
        int totalEvenNumbers=0;


        while ( number <= finalnumber){
            number++;      /** careful, we use it bofore if or endless loop error */
            if(!isEvenNumber(number)){
                totalEvenNumbers+=1;
                continue;
            }
            System.out.println("Even number " + number);

            // It is safe to put totalEvenNumbers++ also on this line
                if (totalEvenNumbers == 5) {
                    break;
                }
        }
        System.out.println("We found " + totalEvenNumbers + " total Even Numbers");
    }
    public static boolean isEvenNumber (int number){

        return number % 2 == 0;
    }
}
