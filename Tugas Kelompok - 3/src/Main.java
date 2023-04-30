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
    public static String answer;
    public static ArrayList<String> answers = new ArrayList<>();
    public static int finalScore=0;
    public static boolean process = false;
    public static boolean isRunning = false;
    public static void main(String[] args) {
        System.out.println("===================\n");
        System.out.println("Coepoe World Puzzle");
        System.out.println("===================\n");

        System.out.println("Rules : ");
        System.out.println("1. Create a word using given characters, min 3 characters & max 6 characters");
        System.out.println("2. Each level, you have 10 chances to answer correctly");
        System.out.println("3. To get through to next level, you have to score 70 points each level");

        
        level(1, level1, answerLevel1);
      
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
        
        System.out.printf("You had answered 10 time %d right answers...", currentScore/10);
        
        if (currentScore >=70){
            process = true;
        }
        finalScore += currentScore;
        
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

//import java.io.*;
//import java.util.Scanner;
//
//public class Main {
//    public static BufferedReader buffer;
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("Hello world!");
//        String word = "letter";
//        boolean isFound = false;
//
//        initDictionary();
//    }
//
//    public static void initDictionary() throws IOException {
//        try {
//            String path = new File(".").getCanonicalPath();
//            String dictionaryPath = path + "/src/data.txt";
//            File f = new File(dictionaryPath);
//
//            BufferedReader b = new BufferedReader(new FileReader(f));
//            buffer = b;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }