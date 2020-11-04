public class operatorsChallenge {

    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double operation = (num1 + num2) * 100.00;
        System.out.println(" My total is: " + operation);
        double modulus = operation % 40.00;
        System.out.println("The remainder is:" + modulus);
        boolean remainder = (modulus==0) ? true : false;
        System.out.println("The remainder is " + remainder);

        if (!remainder) {
            System.out.println("Got some remainder");
        }else{
            System.out.println("the remainder is 0.0");
        }
    }
}
