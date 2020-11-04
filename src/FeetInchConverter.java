public class FeetInchConverter {

    public static void main(String[] args) {

        double centimetersOperation = calcFeetAndInchesToCentimeters(8, 4);
            if (centimetersOperation < 0.0)
                System.out.println("Invalid parameters");

        calcFeetAndInchesToCentimeters(20);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double oneInchToCentimeter = 2.54;
        int oneFoot = 12;

        if ((feet <= 0) || (inches < 0 || inches > 12)){
            return -1;
        }
        double centimeters = ((feet * oneFoot) * oneInchToCentimeter) + (inches * oneInchToCentimeter);
        System.out.println( feet + " feet and " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        int foot = 12;

        if (inches < 0){
            return -1;
        }
        double inchToFeet = inches / foot;
        System.out.println( inches + " inches =" + inchToFeet + " feet" );
        return inchToFeet;
    }
}
