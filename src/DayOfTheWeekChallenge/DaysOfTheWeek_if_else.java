package DayOfTheWeekChallenge;

public class DaysOfTheWeek_if_else {

    public static void main(String[] args) {

        printDayOfTheWeek(3);
    }
    public static void printDayOfTheWeek (int day){
        if(day == 0)
            System.out.println("Sunday");
        else if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tuesday");
        else if (day == 3)
            System.out.println("Wednesday");
        else if (day == 4)
            System.out.println("Thursday");
        else if (day == 5)
            System.out.println("Friday");
        else if (day == 6)
            System.out.println("Saturday");
        else
            System.out.println("Invalid Day");
    }

}
