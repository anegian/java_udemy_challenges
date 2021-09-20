import java.util.Scanner;

public class HolidayChallenge {
    private static final Scanner input = new Scanner(System.in);
    private static final int[] validVotesArray = {0, 0, 0};
    private static int totalValidVotes;
    private static final String[] answers = {"Mykonos", "Santorini", "Rhodes"};

    public static void main(String[] args) {

        runHolidayPollProcess();
    }

    /**
     * - Get users' votes until we have 20 unique votes
     * - Validate users' votes
     * <p>
     * - Calculate the total votes for each island and the total valid votes
     * - Print results
     */
    private static void runHolidayPollProcess() {

        final int votesLimit = 20;

        for (int i = 0; i < votesLimit; i++) {

            Scanner vote = interactWithUser();
            validateVotes(vote);

        }
        input.close();

        printWinner();
        printLoser();
    }

    /**
     * - Displays the poll's initial question
     *
     * @return Scanner input
     */
    private static Scanner interactWithUser() {

        System.out.println("Type a number from 1 to 3 to vote your best holiday destination:");

        for (int i = 0; i < answers.length; i++) {
            System.out.print(i + 1 + "." + answers[i] + "\n");
        }

        return input;
    }


    /**
     * - Validates votes and arranges them in the valid votes array
     * - Prints out which island was voted or Invalid vote whenever user's input was invalid
     *
     * @param input Scanner
     */
    private static void validateVotes(Scanner input) {
        boolean isInt = input.hasNextInt();

        if (isInt) {
            int vote = input.nextInt();

            switch (vote) {
                case 1:
                    System.out.println("You have voted Mykonos\n");
                    totalValidVotes++;
                    validVotesArray[0]++;
                    break;

                case 2:
                    System.out.println("You have voted Santorini\n");
                    totalValidVotes++;
                    validVotesArray[1]++;
                    break;

                case 3:
                    System.out.println("You have voted Rhodes\n");
                    totalValidVotes++;
                    validVotesArray[2]++;
                    break;

                default:
                    System.out.println("Your vote was invalid\n");
                    break;
            }
        } else {
            System.out.println("Your vote was invalid\n");
        }
        input.nextLine();
    }

  /** Alternative way to validate if input is String  input.nextLine (new Scanner(System.in) */

//    private static void validateVotes(String vote) {
//
//        if (vote.equals("1") || vote.equals("2") || vote.equals("3")) {
//            int index = Integer.parseInt(vote) - 1;
//
//            validVotesArray[index]++;
//            totalValidVotes++;
//            System.out.println("You have voted: " + answers[index] +"\n");
//            return;
//        }
//        System.out.println("Your vote was invalid.\n");
//    }

    /**
     * - Calculates the island with the most valid votes
     * - Calculates the percentage of these valid votes
     * - Prints the results
     */
    private static void printWinner() {
        int maxValidVotes = 0;
        int maxPosition = 0;
        for (int i = 0; i < validVotesArray.length; i++) {
            if (validVotesArray[i] > maxValidVotes) {
                maxValidVotes = validVotesArray[i];
                maxPosition = i;
            }
        }
        double maxVotesPercent = (double) maxValidVotes / totalValidVotes * 100;
        double roundedMaxVotesPercent = (double) Math.round(maxVotesPercent * 100) / 100;

        System.out.println("\nThe island voted as the best destination for holidays was: \n" + "'" + answers[maxPosition] + "'" + " with " + roundedMaxVotesPercent + '%');
    }

    /**
     * - Calculates the island with the least valid votes
     * - Calculates the percentage of these valid votes
     * - Prints the results
     */
    private static void printLoser() {
        int minValidVotes = totalValidVotes;
        int minPosition = 0;
        for (int i = 0; i < validVotesArray.length; i++) {
            if (validVotesArray[i] <= minValidVotes) {
                minValidVotes = validVotesArray[i];
                minPosition = i;
            }
        }
        double minPercent = (double) minValidVotes / totalValidVotes * 100;
        double roundedMinPercent = (double) Math.round(minPercent * 100) / 100;

        System.out.println("The island with the least votes was: \n" + "'" + answers[minPosition] + "'" + " with " + roundedMinPercent + '%');
    }
}