public class FeetInchConverter {

    /** calculate feet and inches to centimeter by using 1st method (2 parameters)
    calculate inches to centimeter by overloading methods. 2nd method (inches parameter) uses 1st method (2 parameters)*/
    public static void main(String[] args) {

        double centimetersOperation = calcFeetAndInchesToCentimeters(10.2, 0);
        //validating parameters by using the returned roundOff line 28
        if (centimetersOperation < 0.0) {
            System.out.println("Invalid parameters");
        }
        double inchToFeetToCm = calcFeetAndInchesToCentimeters(16);
        //validating parameters
        if (inchToFeetToCm < 0.0) {
            System.out.println("Invalid parameters");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double oneInchToCentimeter = 2.54; //one inch is 2.54cm
        int oneFoot = 12; // one foot is 12 inches

        if ((feet <= 0) || (inches < 0 || inches > 12)) {
            return -1;
        }else {
            double centimeters = ((feet * oneFoot) * oneInchToCentimeter) + (inches * oneInchToCentimeter);

            // Math.round to round off to 3rd decimal place (a*1000)/1000
            double roundOff = (double) Math.round (centimeters * 1000) / 1000;
            System.out.println(feet + " ft and " + inches + " in = " + roundOff + " cm \n");

            return roundOff;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        int oneFoot = 12;

        if (inches < 0){
            return -1;
        }else {
            // casting (int) to get no decimal feet
            double inchToFeet = (int) inches / oneFoot;
            // we need the decimal places for inches so no casting
            double remainingInches = inches % oneFoot;
            /** watch out parenthesis, error if Math.round ( (a*1000) /1000 )*/
            double roundOffRemainder = (double) Math.round(remainingInches * 1000) / 1000;
            System.out.println(inches + " in = " + inchToFeet + " ft and " + roundOffRemainder + " in.");

            /** return the result in cm, by using the 1st method but changing the parameters to calculate correctly
             if we use as parameters calcFeetAndInchesToCentimeters(feet,inches) we have errors.*/
            return calcFeetAndInchesToCentimeters(inchToFeet, remainingInches);
        }
    }
}
