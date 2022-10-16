import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int dice1 = randomGenerator.nextInt(6) + 1;
        int dice2 = randomGenerator.nextInt(6) + 1;
        int point = 0;
        int scoreNew = 0;
        Scanner scanner = new Scanner(System.in);
        String trash;
        String userInput;

        for (int i =0; i < 1; i++) {
            System.out.println("\n Dice One: " + dice1 + " " + "Dice Two: " + dice2);
            int score = dice1 + dice2;
            System.out.println("\n Score: " + score);

            if (score == 11 || score == 7) {
                System.out.println("\n Score = " + score);
                System.out.println(" You Win!!!");
            }
            if (score == 2 || score == 3 || score == 12 ) {
                System.out.println("\n Score = " + score);
                System.out.println(" You crapped out!!!");
            }
            else if (score == 4 || score == 5 || score == 6 || score == 8 || score == 9 || score == 10){
                point = point + score;
                System.out.println(" Point = " + point);
                do {
                    scoreNew = dice1 + dice2;
                    System.out.println("\n New Score = " + scoreNew);
                    if (scoreNew == point){
                        System.out.println(" You Win!!!");
                        break;
                    }
                    if (scoreNew == 7) {
                        System.out.println(" You crapped out!!");
                        break;
                    }
                } while (scoreNew != point || scoreNew != 7);
            }
        }
        System.out.println("Play again? [Y/N]");
        if (scanner.hasNext()) {
            userInput = scanner.next();
            scanner.nextLine();
            System.out.println("You Chose: " + userInput);
        }
        while (true) {
            String response = scanner.nextLine();
            if (!response.equals("Y")){
                System.out.println("Loading...");
                break;
            }
            if (!response.equals("N")){
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
}
