package SecondsAndMinutesChallenge;

public class SecondsMinutesChallenge {

    public static void getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid Value");
        }else {
            long minAndSecToHours = minutes / 60;
            long remainMin = minutes % 60;
            System.out.println(minAndSecToHours + "h " + remainMin + "m " + seconds + "s ");
        }
    }
    public static void getDurationString(long seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
        }else{
            long secToMin = seconds / 60;
            long remainSec = seconds % 60;
            getDurationString(secToMin, remainSec);
        }
    }
}