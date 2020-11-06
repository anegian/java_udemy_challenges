package SecondsAndMinutesChallenge;

public class SecondsMinutesChallenge {

    public static int getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid Value");
            return -1;
        } else if (minutes < 60) {
            System.out.println("0h " + minutes + "m " + seconds + "s");
            return minutes;
        } else {
            int minAndSecToHours = minutes / 60;
            int remainMin = minutes % 60;
            System.out.println(minAndSecToHours + "h " + remainMin + "m " + seconds + "s ");
         return minAndSecToHours;
        }
    }
    public static int getDurationString(int seconds){
        if (seconds < 0) {
            System.out.println( " Invalid Value ");
            return -1;
        }
            int secToMin = seconds / 60;
            int remainSec = seconds % 60;
            return getDurationString(secToMin,remainSec);
    }
}