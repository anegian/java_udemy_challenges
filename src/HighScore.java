package UdemyChallenges;

public class HighScore {

    public static void main (String [] args){

        int highScorePosition = calculateHighScore(1000);
        displayHighScore("Anestis",highScorePosition);

        highScorePosition = calculateHighScore(900);
        displayHighScore("Tim",highScorePosition);

        highScorePosition = calculateHighScore(400);
        displayHighScore("Jack",highScorePosition);

        highScorePosition = calculateHighScore(50);
        displayHighScore("Houston",highScorePosition);

    }
    public static int calculateHighScore(int playersScore) {

        if (playersScore >= 1000) {                 //  int position = 4;        //alternative way for this method
            return 1;                               /// if (playerScore >= 1000){
        } else if (playersScore >= 500) {           //      position = 1;
            return 2;                               //  }else if (playerScore >= 500){
        } else if (playersScore >= 100) {           //      position = 2;
            return 3;                               //  }else if (playerScore >= 100){
        }                                           //      position = 3;
        return 4;                                   //  }
    }                                               //  return position;
    public static void displayHighScore(String playersName, int highScorePosition) {

        System.out.println( playersName + " managed to get into position " +
                highScorePosition + " on the high score table");

    }
}