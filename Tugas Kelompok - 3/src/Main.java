import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] level1 = {"d", "e", "t", "t", "l", "i"};
    public static String[] level2 = {"s", "e", "c", "a", "e", "n"};
    public static String[] level3 = {"h", "k", "r", "n", "e", "o"};
    public static String[] answerLevel1 = {"die", "led", "lei", "let", "lid", "lie", "lit", "tie",
                                            "deli", "diet", "edit", "idle", "lied", "tied", "tile", "tilt",
                                            "tilde", "tiled", "title", "tilted", "titled"};

    //Syahfiar Dhani
    public static String[] answerLevel2 = {"ace","can","sac","sea","sec","see","aces","acne","cane","cans", "case","ease",
            "sane","scan","seen","acnes","canes","cease","cense","scene","encase","seance"};
    //Andi Iken
    public static String[] answerLevel3 = {"honker","rook","kerne", "kern","her", "neo", "hero", "hen", "hoe", "nor", "hore", "horn", "hone", "one"};
    
    public static String answer;
    public static ArrayList<String> answers = new ArrayList<>();
    public static int finalScore = 0;
    public static boolean process = true;
    public static boolean isRunning = false;
    public static boolean win = false;


    public static void main(String[] args) {
        String repeat = "";
        int currentLevel = 1;

        do {
            // Reset all values everytime program start
            process = true;
            isRunning = false;
            win = false;

            // local variables
            currentLevel = 1;
            repeat = "";

            System.out.println("===================\n");
            System.out.println("Coepoe World Puzzle");
            System.out.println("===================\n");

            System.out.println("Rules : ");
            System.out.println("1. Create a word using given characters, min 3 characters & max 6 characters");
            System.out.println("2. Each level, you have 10 chances to answer correctly");
            System.out.println("3. To get through to next level, you have to score 70 points each level");

            while (process) {
                String[] question = level1;
                String[] answerKey = answerLevel1;

                if (currentLevel == 2) {
                    question = level2;
                    answerKey = answerLevel2;
                } else if (currentLevel == 3) {
                    question = level3;
                    answerKey = answerLevel3;
                }

                level(currentLevel, question, answerKey);

                if (process) {
                    currentLevel += 1;
                } else {
                    break;
                }
            }

            if (win) {
                System.out.println("===================\n");
                System.out.println("You win!! Congrats!!");
                System.out.println("Overall Score: " + finalScore);

                System.out.println("Press ENTER to exit...");
                scanner.nextLine();
            } else {
                System.out.println("===================\n");
                System.out.println("You lose!! Try again? [y/t]");

                repeat = scanner.nextLine();
            }
        } while (repeat.equalsIgnoreCase("y"));
      
    }

    public static void level (int levelNumber, String[] levelChar, String[] answerList){
        int currentScore=0;
        int currentInp=1;
        ArrayList<String> currAnswerList = new ArrayList<String>();
        
        System.out.println("level " + levelNumber);
        System.out.println("-------");
        System.out.print("         ");


        for (String character : levelChar){
            System.out.printf("%-10s",character);
        }
        System.out.println();

        while (currentInp <= 10){
            System.out.print(currentInp+") Your Answer :");
            answer = scanner.nextLine();
            int validatedAnswer = validateAnswer(answer, answerList, currAnswerList);
            
            if (validatedAnswer >= 0){
                if (validatedAnswer != 5){
                    currentInp += 1;
                }
                
                if (validatedAnswer >= 5){
                    if (validatedAnswer == 5){
                        System.out.println("You had already type this word before..");
                    }  else{
                        currentScore += validatedAnswer;
                        System.out.println("#Right. Score : " + currentScore);
                    }
                }
            }
        }
        
        System.out.printf("You had answered 10 time %d right answers...\n", currentScore/10);

        printCorrectAnswer(answerList);
        
        if (currentScore >=70){
            if (levelNumber < 3) {
                process = true;
            } else {
                process = false;
                win = true;
            }
        } else {
            process = false;
            win = false;
        }

        finalScore += currentScore;

    }

    private static void printCorrectAnswer(String[] answerList) {
        int currentIdx = 0;
        int horizontalIdx = 0;

        System.out.println("Correct answers: ");
        while(currentIdx < answerList.length) {
            if (horizontalIdx == 10) {
                System.out.print("\n");
                horizontalIdx = 0;
            }

            System.out.print(answerList[currentIdx]  + "\t");

            horizontalIdx+=1;
            currentIdx += 1;
        }

        System.out.print("\n");
    }
    
    private static int validateAnswer(String answer, String[] answerList, ArrayList<String> currAnswerList) {
        if (answer.length() >= 3 || answer.length() <= 6){
            for (String s : answerList){
                if (s.equals(answer)){
                    if (currAnswerList.contains(answer)){
                        return 5;
                    }
                    currAnswerList.add(answer);
                    return 10;
                } 
            }
            return 0;
        }

        return -1;
    }
}