import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {
    static int score = 0; 
    static int questionIndex = 0; 
    static boolean answered = false; 
    static String[] questions = {
            "What is the capital of India?",
            "Who is known as the iron man of India?",
            "Who is the first prime minister of India?"
    };

    static String[][] options = {
            {"1. mumbai", "2. chennai", "3. New Delhi", "4. Rajasthan"},
            {"1. lal bahadur shastri", "2. sardar vallabhai patel", "3. subash chandra bose", "4.kamaraj"},
            {"1.abdul kalam", "2. jawaharlal nehru", "3. indira gandhi", "4. narasimha rao"}
    };

    static int[] answers = {3, 2, 2}; // Correct options (index + 1)

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz!");

        for (questionIndex = 0; questionIndex < questions.length; questionIndex++) {
            displayQuestion(questionIndex);
            answered = false;
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (!answered) {
                        System.out.println("\nTime's up! Moving to the next question.");
                        questionIndex++;
                        if (questionIndex < questions.length) {
                            displayQuestion(questionIndex);
                        } else {
                            timer.cancel();
                        }
                    }
                }
            }, 15000);

         
            int userAnswer = scanner.nextInt();
            answered = true;

           
            timer.cancel();

            if (userAnswer == answers[questionIndex]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + answers[questionIndex]);
            }
        }

     
        displayResult();
    }

    private static void displayQuestion(int index) {
        System.out.println("\nQuestion " + (index + 1) + ": " + questions[index]);
        for (String option : options[index]) {
            System.out.println(option);
        }
        System.out.println("You have 15 seconds to answer. Please select an option (1-4): ");
    }

    private static void displayResult() {
        System.out.println("\nQuiz Over!");
        System.out.println("Your final score: " + score + "/" + questions.length);
    }
}