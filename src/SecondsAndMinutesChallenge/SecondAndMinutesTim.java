package SecondsAndMinutesChallenge;

public class SecondAndMinutesTim {

    //adding a constant variable to use every time we need to display invalid value
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        // by doing the methods to return String we must use the system.out.print to display the result
        System.out.println(getDurationString(59,0));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-45));

    }

    private static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }else if (minutes < 60) {
            return "00h " + minutes + "m " + seconds + "s";
        }else {
            long minToHours = minutes / 60;
            long remainMin = minutes % 60;

            String hourString = minToHours + "h";
            if (minToHours<10)
                hourString = "0" + hourString;

            String minString = remainMin + "m";
            if (remainMin<10)
                minString = "0" + minString;

            String secString = seconds + "s";
            if (seconds<10)
                secString = "0" + secString;

            return hourString + " " + minString + " " + secString;
        }
    }
    private static String  getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }else{
            long secToMin = seconds / 60;
            long remainSec = seconds % 60;
            return getDurationString(secToMin, remainSec);
        }
    }
}
